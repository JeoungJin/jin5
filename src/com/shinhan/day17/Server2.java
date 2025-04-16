package com.shinhan.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server2 {
	private static final int PORT = 12345;
	private static Set<PrintWriter> clientWriters = Collections.synchronizedSet(new HashSet<>());

	//POOL
	private static ExecutorService threadPool = Executors.newFixedThreadPool(10); // 최대 10개 스레드
	
    public static void main(String[] args) {
        System.out.println("서버 시작됨... 포트: " + PORT);

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("새 클라이언트 연결됨: " + socket.getRemoteSocketAddress());
                threadPool.execute(new ClientHandler(socket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }
    }
    
	public static void main2(String[] args) throws IOException {
		System.out.println("서버 시작됨... 포트: " + PORT);
		ServerSocket serverSocket = new ServerSocket(PORT);

		while (true) {
			Socket socket = serverSocket.accept();
			System.out.println("새 클라이언트 연결됨: " + socket.getRemoteSocketAddress());
			new ClientHandler(socket).start();
		}
	}

	private static class ClientHandler extends Thread {
		private Socket socket;
		private PrintWriter out;

		public ClientHandler(Socket socket) {
			this.socket = socket;
		}

		public void run() {
			try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));) {
				out = new PrintWriter(socket.getOutputStream(), true);
				clientWriters.add(out);

				String message;
				while ((message = in.readLine()) != null) {
					System.out.println("받은 메시지: " + message);
					for (PrintWriter writer : clientWriters) {
						writer.println(message);
					}
				}
			} catch (IOException e) {
				System.out.println("클라이언트 연결 끊김: " + socket.getRemoteSocketAddress());
			} finally {
				try {
					socket.close();
				} catch (IOException e) {
				}
				clientWriters.remove(out);
			}
		}
	}
}
