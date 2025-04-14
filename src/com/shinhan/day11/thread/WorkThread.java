package com.shinhan.day11.thread;

public class WorkThread extends Thread {

	boolean work  =true;
	
	WorkThread(String name){
		setName(name);
	}

	@Override
	public void run() {
		 while(true) {
			 if(work) {
				 System.out.println(getName() + " 작업처리");
			 }else {
				 Thread.yield(); //yield는 switch문장에서 사용하는 예약어, 이 코드는 Thread의 메서드  
			 }
		 }
		 
		 
		 
		 
	}
	
	
}
