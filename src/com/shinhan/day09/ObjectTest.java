package com.shinhan.day09;

import java.nio.file.spi.FileSystemProvider;
import java.util.HashSet;

public class ObjectTest {

	public static void main(String[] args) {
		f7();
	}
	
	private static void f7() {
		String str1 = new String("신한DS 소프트아카데미");
		String str2 = new String("신한DS 소프트아카데미");
		PersonVO p1 = new PersonVO("A",1,null);
		PersonVO p2 = new PersonVO("B",1,null);
		
		System.out.println(p1.equals(p2));
		
		
		System.out.println(str1);
		System.out.println(str1.toString());
		System.out.println(p1);
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1.hashCode() == str2.hashCode()); //
		System.out.println(str1 == str2); //
		System.out.println(str1.equals(str2));
		System.out.println(p1.hashCode());
		
	}

	private static void f6() {
		PersonVO p1 = new PersonVO("김길동", 20, "학생");
		PersonVO p2 = new PersonVO("김길동", 20, "학생");
		System.out.println(p1.getJob());
		p1.setAge(22);
		System.out.println(p1.toString());
		System.out.println(p1.equals(p2));
		
	}

	private static void f5() {
		//Collection : List, Set(순서없고 중복불가, 키로 사용함), Map
		//  Set interface를 구현한 class  : HashSet
		
		HashSet<Coffee> data = new HashSet<Coffee>();
		data.add( new Coffee("A", 1000));
		data.add( new Coffee("A", 1000));
		data.add( new Coffee("A", 3000));
		data.add( new Coffee("B", 2000));
		for(Coffee s:data) {
			System.out.println(s);
		}
		
		
	}
	
	
	private static void f4() {
		//Collection : List, Set(순서없고 중복불가, 키로 사용함), Map
		//  Set interface를 구현한 class  : HashSet
		
		HashSet<String> data = new HashSet<String>();
		data.add("월요일");
		data.add("화요일");
		data.add("토요일");
		data.add("토요일");
		for(String s:data) {
			System.out.println(s);
		}
		
		
	}
	private static void f3() {
		Coffee obj1 = new Coffee("아메리카노", 3000);
		Coffee obj2 = new Coffee("아메리카노", 3000);
		//Coffee obj2 = new Coffee("카페라떼", 4000);
		
		System.out.println(obj1);
		System.out.println(obj1.toString()); 
		//재정의없으면 Object의 toString() : 주소return 
		System.out.println(obj1.hashCode());
		
		System.out.println(obj2);
		System.out.println(obj2.toString());
		System.out.println(obj1.hashCode());
		
		System.out.println(obj1 == obj2?"주소같다":"주소다르다");
		System.out.println(obj1.equals(obj2)?"내용같다":"내용다르다");//재정의, 내용비교
		//재정의없으면 Object의 equals() : 주소비교  
		System.out.println(obj1.equals("라라라"));
	}
	

	private static void f2() {
		String obj1 = new String("자바");
		String obj2 = new String("자바");
		
		System.out.println(obj1);
		System.out.println(obj1.toString()); //재정의..문자자신이 return됨 
		System.out.println(obj1.hashCode());
		
		System.out.println(obj2);
		System.out.println(obj2.toString());
		System.out.println(obj1.hashCode());
		
		System.out.println(obj1 == obj2?"주소같다":"주소다르다");
		System.out.println(obj1.equals(obj2)?"내용같다":"내용다르다");//재정의, 내용비교
		
	}
	
	private static void f1() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println(obj1.hashCode());
		
		System.out.println(obj2);
		System.out.println(obj2.toString());
		System.out.println(obj1.hashCode());
		
		System.out.println(obj1 == obj2?"주소같다":"주소다르다");
		System.out.println(obj1.equals(obj2)?"주소같다":"주소다르다");
		
	}

}
