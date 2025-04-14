package com.shinhan.day11;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
class Pair<K, V> {
	private K key;
	private V value;

}

class ChildPair<K, V, A> extends Pair<K, V> {
	
	A data;
	
	public ChildPair(K k, V v, A data) {
		super(k, v);
		this.data = data;
	}
}

@AllArgsConstructor
@Getter
class OtherPair<K, V> {
	private K key;
	private V value;
}
class Util{
	//파라메터로 받은 첫번째 값이 Pair만된다. Pair<K,V>, Pair<K,V>의 하위도 가능하다.  (상위  = 하위) 
	static <K,V>  V getValue(Pair<K,V> pair, K key) {
		if(pair.getKey().equals(key)) {
			return pair.getValue();
		}
		
		return null;
	}
	
	//1)타입매개변수 선언은 super는 사용불가 
	//<P extends Pair<K,V>,K,V>
	//<T extends Number> //Number, Integer, Double......
	//<T super Number> : 타입의 추론이 모호 Number, Object
	//2)와일드가드 사용시(메서드매개변수, 변수선언)는 extends, super모두 가능 
	// Applicant<? extends Student>
	// Applicant<? super Worker
	static <P extends Pair<K,V>,K,V>  V getValue2(P pair, K key) {
		
		List<? super Number> alist = new ArrayList<>();
		List<? extends Number> alist2 = new ArrayList<>();
		List<?> alist3 = new ArrayList<>();
		
		
		if(pair.getKey().equals(key)) {
			return pair.getValue();
		}
		
		
		return null;
	}
	
}





public class UtilExample {
		public static void main(String[] args) {
			Pair<String, Integer> pair = new Pair<>("홍길동", 35);
			Integer age = Util.getValue(pair, "홍길동");
			System.out.println(age); //35

			ChildPair<String, Integer, String> childPair = new ChildPair<>("홍삼원", 20, "sss");
			Integer childAge = Util.getValue2(childPair, "홍삼순");
			System.out.println(childAge); //null
			/*
			OtherPair<String, Integer> otherPair = new OtherPair<>("홍삼원", 20);
			int otherAge = Util.getValue2(otherPair, "홍삼원"); 
			System.out.println(otherAge);
			*/
		}
 }

 
