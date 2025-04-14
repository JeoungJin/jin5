package com.shinhan.day11.thread;

class Parent{
	
}

public class NumberRunnableClass extends Parent implements Runnable{

	@Override
	public void run() {
		for(int ch = 1; ch<=26; ch++) {
			System.out.println("[" + Thread.currentThread().getName() + "]" + ch);
			
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
