package com.shinhan.day11.thread;


//멀티쓰레드 가능 ...Runnable인터페이스 구현하면 멀티쓰레드 가능 
public class LowercaseThread extends Object implements Runnable {

	@Override
	public void run() {
		
		for(char ch = 'a'; ch<='z'; ch++) {
			System.out.println("["+ Thread.currentThread().getName()+"]"+ ch);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

	//run메서드 구현하면 다중흐름을 가질수있다. 
	//run()메서드 재정의해야한다 
	
}
