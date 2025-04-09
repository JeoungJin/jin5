package com.shinhan.day07.lab2;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		
		//자동형변환
		Tire tire =snowTire;
		
		//메서드호출은 instance를 따른다. 
		snowTire.run();
		tire.run();
	}
}
