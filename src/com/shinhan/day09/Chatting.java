package com.shinhan.day09;

class Shinhan {

}

//Outer Class
public class Chatting {
	// 1.instance Inner Class
	class Chat {
		void start() {
			System.out.println("1.instance Inner Class...start()");
		}

		void sendMessage(String message) {
			System.out.println("1.instance Inner Class...sendMessage()" + message);
		}
	}

	// 2.static Inner Class
	static class Chat2 {
		void start() {
			System.out.println("2.static Inner Class...start()");
		}

		void sendMessage(String message) {
			System.out.println("2.static Inner Class...sendMessage()" + message);
		}
	}
	
	void f2() {
		Chatting.Chat2 aa = new Chatting.Chat2();
		aa.start();
		aa.sendMessage("!!!");
	}

	void f1() {
		Chatting.Chat aa = new Chatting().new Chat();
		Chatting.Chat bb = new Chat();
		aa.start();
		aa.sendMessage("!!!");
	}

	public static void main(String[] args) {
		new Chatting().startChat("abc");
	}

	void startChat(String chatId) {
		String nickName = null;
		//nickName = chatId;//불가
		
		//Inner Class재정의...익명구현 Local class.....지역변수를 사용가능 단,지역변수는 final임 (수정불가)
		Chatting.Chat bb = new Chat() {
			void start() {
				//불가 nickName="";
				System.out.println("3.익명구현 Local class...start()" + nickName);
			}

			void sendMessage(String message) {
				System.out.println("3.익명구현 Local class...sendMessage()" + message + nickName);
			}
		};
		bb.start();
		bb.sendMessage("!!!");
		
		
//		Chat chat = new Chat() {
//			@Override
//			public void start() {
//				while (true) {
//					String inputData = "안녕하세요";
//					String message = "[" + nickName + "] " + inputData;
//					sendMessage(message);
//				}
//			}
//		};
//		chat.start();
	}
}
