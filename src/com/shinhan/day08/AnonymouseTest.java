package com.shinhan.day08;

//인터페이스 : 상수 + 추상메서드(정의있고 구현없음, 구현은 구현class가 한다) + default method + static method + private method 
//규격서 (규칙을 정하고 구현class가 규칙을 따르는 로직을 구현)

interface MyInterface{
	public abstract void use();
}
class MyClassA implements MyInterface{
	public void use() {
		System.out.println("구현class--A");
	}
}
class MyClassB implements MyInterface{
	public void use() {
		System.out.println("구현class--B");
	}
}

//익명구현class연습
public class AnonymouseTest {
	
		
	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		MyInterface my1 = new MyInterface() {
			public void use() {
				System.out.println("익명 구현class--C");
			}
		};
		MyClassA my2 = new MyClassA();
		MyClassB my3 = new MyClassB();
		 
		work(my1);
		work(my2);
		work(my3);
		work(new MyInterface() {
			@Override
			public void use() {
				System.out.println("익명 구현class-D");
				
			}
		});
		
		(new MyInterface() {
			
			@Override
			public void use() {
				System.out.println("익명 구현class-E");
				
			}
		}).use();
		
		//람다표현식 
		MyInterface my5 = ()->{System.out.println("익명 구현class-F");};
		work(my5);
		
		
		
	}
	
	private static void work(MyInterface mm) {
		mm.use();
	}
	
}

 















