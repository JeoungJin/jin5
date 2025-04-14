package com.shinhan.day11.thread;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ShareArea {
	
	private Account sung;
	private Account lee;
	
	//이함수을 점유하고있는 Thread가 있다면 다른Thread는 진입하지않고기다린다. 
	//실행중인 Thread가 lock을 건다 
	public synchronized void transfer() {
		int amount = lee.withdraw(100);
		System.out.println("[출금(lee->sung)]" + amount);
		sung.deposit(amount);
		System.out.println("[입금(sung)]" + amount);
		System.out.println("----------------------------");

	}
	public  synchronized void print() {
		int a = sung.getBalance();
		int b = lee.getBalance();
		
		System.out.println("[잔액합계]" + (a+b) );
	}
	
}
