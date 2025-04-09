package com.shinhan.day07;

public class Child1 extends Parent {

	//부모의 field이름과 동일하면 자식것이 우선 
	boolean score;
	
	
	//1.field 추가
	String myName;
	
	
	//2.생성자를 추가
	public Child1(int score, String myName) {
		//this.score = score;
		super(score); //명시적으로 부모의 생성자를 호출 
		this.myName = myName;
	}
	
	//3.method추가
	void display() {
		System.out.println("score=" + score);
		System.out.println("myName=" + myName);
	}
	
	//4.method수정(override, 덮어쓰기) : 이름같고 매개변수갗고 return같고 Modifier는 같거나 더 넓어져야한다. 
	@Override
	public void info() {
		//System.out.println("자식의 info메서드이다. score="+score);
		super.info();
		System.out.println("자식의 info메서드이다. myName="+myName);
		System.out.println("-----------------------------------");
	}
	//Overloading : 이름같고 매개변수 다르다. 
	public void info(String title) {
		//System.out.println("자식의 info메서드이다. score="+score);
		super.info();
		System.out.println("!!!!!Overloading...자식의 info메서드이다. myName="+myName);
		System.out.println("!!!!!Overloading  -----------------------------------");
	}
	
	
	public Child1() {
		//super(); // ...부모의 생성자를 호출한다(생략가능),첫줄에만 작성가능 
		super(0);
		System.out.println("자식1 default생성자");
		
	}
	
	
	
	
}
