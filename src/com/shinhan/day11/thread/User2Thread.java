package com.shinhan.day11.thread;


public class User2Thread extends Thread{
	
	Calculator calculator;
	 
	User2Thread(String name, Calculator calculator){
		setName(name);
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory2(50);
	}
	

}
