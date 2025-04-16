package com.shinhan.day17;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Server1 {

	public static void main(String[] args) throws IOException {
		
		startServer();
		Scanner sc = new Scanner(System.in);
		while(true) {
			String key = sc.nextLine();
			if(key.toLowerCase().equals("q")) break;
		}
		sc.close();
		System.out.println("서버종료");
		serverSocket.close();
		
	}
	
	static ServerSocket serverSocket;
	
	private static void startServer() {
		Thread t1 = new Thread() {
			public void run() {
				try {
					serverSocket = new ServerSocket(5001);
					System.out.println("----서버시작-------");
					Socket socket = serverSocket.accept();		
					InetSocketAddress addr = (InetSocketAddress)socket.getRemoteSocketAddress();
					System.out.println("접속한 client연결:" + addr.getHostString());		
					while(true) {
						
						if(socket.isClosed()) continue;
						
						DataInputStream dis = new DataInputStream(socket.getInputStream());
						String message = dis.readUTF();
						
						DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
						dos.writeUTF(message + "보냄");
						dos.flush();
						System.out.println("클라이언트에게 받은 데이터:" + message);
						
						
						//socket.close();
						//System.out.println("접속한 client닫힘:" + addr.getHostString());
					}
				} catch(SocketException ex) {
					System.out.println(ex.getMessage());
				}catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
		};
		t1.start();
		
	}


	public static void main2(String[] args) throws UnknownHostException {
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println(addr.getHostName());
		System.out.println(addr.getHostAddress());
		
		InetAddress addr2 = InetAddress.getByName("www.naver.com");
		System.out.println(addr2.getHostAddress());
		InetAddress[] addr3 = InetAddress.getAllByName("www.naver.com");
		for(InetAddress aa:addr3) {
			System.out.println(aa.getHostAddress());
		}
	}

}
