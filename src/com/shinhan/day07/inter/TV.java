package com.shinhan.day07.inter;

//interface : 규격서 , 상수 + 추상메서들의 묶음 
public interface TV {
	//1.상수, public static final생략가능 
	int SBS = 6;
	public static final int KBS = 9;
	
	//2.추상메서드 , public abstract 생략가능 
	void powerOn();
	public abstract void powerOff();
	public abstract void show();
	
	//3.default method:구현 class가 공통적으로 사용가능한 기능,  재정의 가능한 메서드 
	default void active() {
		System.out.println("interface의 default 메서드 active()");
		privateMethod();
		System.out.println("----------default method에 주로하는 코드-----");
		powerOn();
		show();
		powerOff();
	}
	
	//4.static method :구현class가 재정의불가
	public static void staticMethod() {
		System.out.println("interface의 static메서드...구현class가 재정의불가");
		privateStaticMethod();
	}
	
	
	//5.private method
	private void privateMethod() {
		System.out.println("interface의 내부에서만 사용되는 private메서드");
	}
	//6.private static method 
	private static void privateStaticMethod() {
		System.out.println("interface의 내부에서만 static 사용되는 메서드");
	}
}







