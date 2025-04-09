package com.shinhan.day07.inter;

//인터페이스 
interface FirstZone{
	void call();
}
abstract class AbstractFirst{
	
}
//구현class
class FirstZoneImpl implements FirstZone{
	public void call() {
		
	}
}

interface A{}
class B implements A{}
class C implements A{}
class D extends B{}
class E extends C{}

 

public class Exercise {

	TV aa = new SamsungTV();
	
	
	public static void main(String[] args) {
		call();

	}

	private static void call() {
		method(new B());
		method(new C());
		method(new D());
		method(new E());
		
	}

	private static void method(A aa) {
		// TODO Auto-generated method stub
		
	}

	private static void f2() {
		TV tv = new SamsungTV();
	    f3(new SamsungTV());	
	    
	    TV[] arr = new TV[3];
	    arr[0] = new SamsungTV();
	    
	    SamsungTV tv2 = new SamsungTV();
	    TV tv3 = tv2;
	    
	    
	}

	private static void f3(TV tv) {
		tv.powerOn();
		
	}

	private static void f1() {
		//interface는 instance생성 불가 FirstZone a = new  FirstZone();
		//Abstract class는 instance생성  불가 AbstractFirst a = new AbstractFirst();
		FirstZoneImpl a = new FirstZoneImpl();
	}

}
