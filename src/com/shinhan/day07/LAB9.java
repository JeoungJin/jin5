package com.shinhan.day07;

class A {}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends B{}
class F extends C{}

public class LAB9 {

	private static void f1() {
		B b1 = new B();
		B b2 = new D();  //부모 = 자식
		B b3 = new E();
		//B b4 = (B)new A();  ClassCastException
		
		D d = (D)b2;  //자식 = (자식)부모
		
		
	}
	private static void f3() {
		E v1 = new E();
		A v2 = v1;
		B v3 = v1;
		
		E aa = (E)v2;
		E bb = (E)v3;
		D dd = (D)v3; //ClassCastException
	}
	
	
	
	private static void f2() {
		F v1 = new F();
		A v2 = new F();
		C v3 = new F();
		
		F v4 = (F)v2;
		F v5 = (F)v3;
		 
	}

	
	public static void main(String[] args) {
		f3();

	}


	
	

}
