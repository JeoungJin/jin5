package com.shinhan.day06.lab2;

class Parent{
	int s = 100;
	void f1() {
		System.out.println("부모 f1");
	}
}
class Child extends Parent{
	String s = "자식변수";
	void f1() {
		System.out.println("자식 f1");
	}
}

public class Test {

	public static void main(String[] args) {
		Parent a = new Child();  //메서드 호출은 instance 따른다. 
		a.f1();
		System.out.println(a.s);  //field는 타입을 따른다. 

	}

}
