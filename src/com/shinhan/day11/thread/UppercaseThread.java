package com.shinhan.day11.thread;


//멀티쓰레드 가능 
public class UppercaseThread extends Thread {

	@Override
	public void run() {
		
		for(char ch = 'A'; ch<='Z'; ch++) {
			System.out.println("["+ currentThread().getName() + "]"+  ch);
			
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

	//run메서드 구현하면 다중흐름을 가질수있다. 
	//run()메서드 재정의해야한다 
	
}
