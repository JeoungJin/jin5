package com.shinhan.day08.exception;

public class Chatting {
	class Chat {
		void start() {
		}

		void sendMessage(String message) {
		}
	}

	void startChat(String chatId) {
		String nickName = null;
		//nickName = chatId;
		
		//Local inner class는 지역변수를 접근가능, final이기때문에 수정불가 
		Chat chat = new Chat() {
			@Override
			public void start() {
				while (true) {
					String inputData = "안녕하세요";
					String message = "[" +  nickName+  "] " + inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
}
