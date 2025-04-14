package com.shinhan.day11;

import java.util.ArrayList;

public class GenericTest {

	// 제네릭메서드

	public static <M extends Object , S, C> Bag<M, S, C> makeBag(M model, S size, C color) {
		// Bag를 만들어서 return함수이다.
		Bag<M, S, C> obj = new Bag<>(model, size, color);
		return obj;
	}

	public static void useBag() {
		System.out.println(makeBag("모델", "사이즈", "칼러"));
		System.out.println(makeBag("모델", 100, "red"));
		System.out.println(makeBag("모델", 100, 255));
		System.out.println(makeBag(123, 100, 255));
		System.out.println(makeBag(new Car("aa", 1), 100, 255));
	}

	public static void main(String[] args) {

		useBag();

		/*
		 * Product<String,String> result_product1 = makeProduct("100", "문자2", 3000);
		 * System.out.println(result_product1);
		 * 
		 * Product<Integer,String> result_product2 = makeProduct(100,"문자", 4000);
		 * System.out.println(result_product2);
		 * System.out.println(result_product2.getModel() + 2);
		 * System.out.println(result_product1.getModel() + 2);
		 */
	}

	public static <A, B> Product<A, B> makeProduct(A a, B b, int price) {

		Product<A, B> p1 = new Product<A, B>();
		Product<A, B> p2 = new Product<A, B>(a, b, price);

		return p2;
	}

	private static void f3() {
		ArrayList<String> data = new ArrayList<>();
		data.add("자바프로그램");
		String s = data.get(0);
		System.out.println(s);

	}

	private static void f2() {
		// Collection : List(순서있음,중복가능), Set(순서없음,중복불가), Map(키와 값의쌍)
		// List interface : 구현class....ArrayList, LinkedList, Vector.......

		ArrayList data = new ArrayList();
		data.add(100);
		data.add("자바프로그램");
		data.add(new Car("abc", 1000));

		int i = (Integer) data.get(0);
		String s = (String) data.get(1);
		Car c = (Car) data.get(2);

		System.out.println(i);
		System.out.println(s);
		System.out.println(c);

	}

	private static void f1() {
		Product<String, String> p1 = new Product<>("ABC", "large", 1000);
		// int->Integer (AutoBoxing)
		Product<String, Integer> p2 = new Product<>("DDD", 10, 2000);
		Product<Integer, Integer> p3 = new Product<>(1, 2, 3);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
