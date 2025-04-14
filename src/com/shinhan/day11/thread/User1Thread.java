package com.shinhan.day11.thread;


public class User1Thread extends Thread{
	
	Calculator calculator;
	
	User1Thread(String name, Calculator calculator){
		setName(name);
		this.calculator = calculator;
	}
	 
	@Override
	public void run() {
		calculator.setMemory2(100);
	}
	

}
