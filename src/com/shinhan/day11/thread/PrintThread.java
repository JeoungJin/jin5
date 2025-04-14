package com.shinhan.day11.thread;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PrintThread extends Thread {
	ShareArea shareArea;
	
	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			//방법2)공유영역에 method를 만들고 synchronized
			shareArea.print();
			
			/*방법1)synchronized 블럭사용하기 
			synchronized (shareArea) {
				int a = shareArea.getSung().getBalance();
				int b = shareArea.getLee().getBalance();
				
				System.out.println("[잔액합계]" + (a+b) );
			}
			*/
			
	 
		}
	
	}
	
}
