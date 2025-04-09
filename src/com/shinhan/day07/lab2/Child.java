package com.shinhan.day07.lab2;

public class Child extends Parent {
	public String name;

	public Child() {
		this("홍길동"); //생성자호출은 1회: 자신=>this() 부모=>super()
		System.out.println("4.Child() call");
	}

	public Child(String name) {
		//super()
		this.name = name;
		System.out.println("3.Child(String name) call");
	}
}