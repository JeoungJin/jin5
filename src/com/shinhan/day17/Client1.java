package com.shinhan.day17;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.UUID;

public class Client1 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost", 5001);
		System.out.println("서버에 연결됨");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("보낼메시지>");
			String message = sc.nextLine();
			if(message.equals("q")) break;
			UUID uuid = UUID.randomUUID();
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(message + uuid.toString());
			dos.flush();
			System.out.println("클라이언트가 보냄 데이터:" + message);
			
			
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String receiveMessage = dis.readUTF();
			System.out.println("클라이언트가 받은 데이터:" + receiveMessage);
		}
		
		sc.close();
		
		socket.close();
		System.out.println("클라이언트 닫힘");

	}

}
