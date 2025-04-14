package com.shinhan.day11.thread;

import lombok.Getter;

@Getter
public class Calculator {

	int memory;
	
	//동기화메서드(lock걸기)
	synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}
	
	void setMemory2(int memory) {
		
		synchronized (this) {
			this.memory = memory;
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		}
		
		
	}
	
	
	
}
