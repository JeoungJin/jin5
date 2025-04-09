package com.shinhan.day07;

//abstract class : 추상메서드가 0개 이상 있다. 
public abstract class Shape {

	//부모를 통해 자식의 기능을 이용하기위해 정의 
	//자식의 재정의하면 재정의된 메서드가 수행된다.
	//abstract:  정의는 있고 구현은 없다 (abstract method)
	//
	public abstract double getArea();
	void f1() {
		System.out.println("일반메서드 구현");
	}
}
