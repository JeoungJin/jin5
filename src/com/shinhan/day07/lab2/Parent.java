package com.shinhan.day07.lab2;

public class Parent {
	public String nation;

	public Parent() {
		this("대한민국"); //super()안함
		System.out.println("2.Parent() call");
	}

	public Parent(String nation) {
		//super()수행...Object가 생성 
		this.nation = nation;
		System.out.println("1.Parent(String nation) call");
	}
}
