package com.shinhan.day07.lab;

public class Child extends Parent {
	public int studentNo;

	public Child(String name, int studentNo) {
		//super();
		/*
		 * 해결방법2)명시적으로 부모의 생성자를 호출한다. (OK)
		 */
		super(name);
		//this.name = name;
		this.studentNo = studentNo;
	}
}
