package com.shinhan.day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import lombok.Builder;
import lombok.Data;

public class Review {

	public static void main(String[] args) {
		//Collection add():List,Set
         //Map  interface 
		//List : ArrayList. LinkedList,Vector 순서있음, 중복가능 
		//Set : HashSet(순서없음), TreeSet(순서있음)  키로사용, 중복불가,
		//Map : 키와 값의 쌍이다. HashMap, HashTable,  TreeMap
		List<Integer> a1 = new ArrayList<>();
		List<Integer> a2 = new LinkedList<>();
		List<Integer> a3 = new Vector<>(); //thread안정적
		Set<Integer> a4 = new HashSet<>();
		Set<Integer> a5 = new TreeSet<>();  //Comparable를 구현한 class만 add() 가능 
		Map<String,Integer> a6 = new HashMap<>();  //키는 중복불가 (hashcode, equals 동일성 체크) 
		Map<String,Integer> a7 = new Hashtable<>(); //thread안정적
		Map<String,Integer> a8 = new TreeMap<>();//Comparable를 구현한 class만 put() 가능 
		Stack<Integer> a9 = new Stack<Integer>(); //LIFO
		Queue<Integer> a10 = new LinkedList<>(); //FIFO
		
//		Set<Book> data = new TreeSet<>();
//		data.add(new Book("A", 300));
//		data.add(new Book("B", 300));
//		data.add(new Book("A", 200));
//		System.out.println(data.size());
//		for(Book b:data) {
//			System.out.println(b);
//		}
		
		//Key값으로 SOrt된다. 
		Map<Book,Integer> data2 = new TreeMap<>();
		data2.put(new Book("A", 300), 1000);
		data2.put(new Book("B", 500), 2000);
		data2.put(new Book("C", 300), 3000);
		System.out.println(data2.size());
		
		for(Entry<Book,Integer> entry  :data2.entrySet()) {
			System.out.println("key:" + entry.getKey());
			System.out.println("value:" + entry.getValue());
			System.out.println("----------------------");
		}
		
	}

}


@Data
@Builder
class Book implements Comparable<Book> {
	String title;
	int price;
//	public Book(String title, int price) {
//		super();
//		this.title = title;
//		this.price = price;
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(price, title);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Book other = (Book) obj;
//		return price == other.price && Objects.equals(title, other.title);
//	}
	@Override
	public int compareTo(Book obj) {
		// TODO Auto-generated method stub
		int comp1 = price - obj.price;
		if(comp1 == 0) return obj.title.compareTo(title);//DESC
		return comp1; //ASC
	}
	
	
}


























