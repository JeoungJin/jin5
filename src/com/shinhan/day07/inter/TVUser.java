package com.shinhan.day07.inter;

public class TVUser {

	public static void main(String[] args) {
		f2();
	}

	private static void f2() {
		TV tv = new SamsungTV();
		tv.active();
		
	}

	private static void f1() {
		//interfce타입 = 구현class
		TV tv = new LgTV();
		tv.powerOn();
		tv.powerOff();
		tv.active();
		System.out.println(TV.KBS);
		TV.staticMethod();
		
		
		if(tv instanceof SamsungTV sam) {
			sam.samsungInfo();
			sam.sound();
		}
		if(tv instanceof LgTV lg) {
			lg.display();	
			LgTV.staticMethod();
		}
		
		
	}
}
