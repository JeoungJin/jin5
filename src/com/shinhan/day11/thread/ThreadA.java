package com.shinhan.day11.thread;

public class ThreadA extends Thread{

	WorkObject workObject;
	
	ThreadA(WorkObject workObject){
		this.workObject = workObject;
		setName("쓰레드A");
	}
	
	public void run() {
		for(int i = 1; i<=10; i++) {
			workObject.methodA();
		}
		workObject.f_all();
	}
}
