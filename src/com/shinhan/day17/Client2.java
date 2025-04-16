package com.shinhan.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client2 {
	private static final String SERVER_IP = "localhost"; // 또는 서버 IP
	private static final int SERVER_PORT = 12345;

	public static void main(String[] args) throws IOException {
		try (Socket socket = new Socket(SERVER_IP, SERVER_PORT);
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));) {
			System.out.println("서버에 연결됨.");

			// 메시지 수신 스레드
			Thread receiveThread = new Thread(() -> {
				String serverMsg;
				try {
					while ((serverMsg = in.readLine()) != null) {
						System.out.println("[받음] " + serverMsg);
					}
				} catch (IOException e) {
					System.out.println("서버와의 연결이 종료됨.");
				}
			});
			receiveThread.start();

			// 메시지 송신 루프
			String userInput;
			while ((userInput = consoleReader.readLine()) != null) {
				out.println(userInput);
			}
		}
	}
}
