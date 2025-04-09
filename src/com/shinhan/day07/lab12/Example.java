package com.shinhan.day07.lab12;

class A {
	public void method1() {
		System.out.println("A-method1()");
	}
}

class B extends A {
	@Override
	public void method1() {
		System.out.println("B-method1()");
	}
}

class C extends A {
	@Override
	public void method1() {
		System.out.println("C-method1()");
	}
	//추가 
	public void method2() {
		System.out.println("C-method2()");
	}
}

public class Example {
	public static void action(A a) {
		a.method1();
		if (a instanceof C v1) {
			//C v1 = (C)a;
			v1.method2();
		}
	}

 

	public static void main(String[] args) {
		action(new A());
		action(new B());
		action(new C());
		
		A a = new C();
		if(a instanceof C v1) {
			v1.method2();
		}
		   
		
		
		
	}

}








