package com.shinhan.day13;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

//interface Consumer{
//	void accept(Object obj);
//}


public class LambdaTest2 {

	public static void main(String[] args) {
		f1();

	}

	private static void f1() {
		//객체를 parameter넘기고 이것을 사용하는 람다표현식 
		Consumer<String> a = (s)->{
			System.out.println(s);
		};
		BiConsumer<String, Integer> b = (s, i)->{};
		
	}

}










