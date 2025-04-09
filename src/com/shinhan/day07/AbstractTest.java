package com.shinhan.day07;

abstract class AnimalParent {
	//abstract : 자식이 반드시 ㄱ구현할 의무가 있다. 
	abstract void sound();
	void f1() {
		System.out.println("AnimalParent f1()");
	}
}

abstract class Animal extends AnimalParent{
	//부모가 정의한 추상메서드를 반드시 구현해야 하지만 안했으므로 이 class도 추상class
	void f2() {
		System.out.println("Animal f2()");
	}
}



class Dog extends Animal {
	void sound() {
		System.out.println("멍멍~");
	}
}

class Cat extends Animal {
	void sound() {
		System.out.println("야옹~");
	}
}

public class AbstractTest {

	public static void main(String[] args) {
		work(new Dog());
		work(new Cat());

	}

	private static void work(Animal ani) {
		
		ani.sound();
		
		/*
		if(ani instanceof Dog) {
			((Dog)ani).sound();	
		}
		if(ani instanceof Cat) {
			((Cat)ani).sound();	
		}*/
		
	}

}






