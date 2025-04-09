package com.shinhan.day07.inter;

//TV interface를 구현한 class이다. 
public  class LgTV implements TV  {

	String company2 = "LG전자";
	
	void display() {
		System.out.println("우리회사는 화질이 좋아요");
	}
	
	 
	public void powerOn() {
	   System.out.println(getClass().getSimpleName()+"전원켠다!!!");
		
	}

	 
	public void powerOff() {
		System.out.println(getClass().getSimpleName()+"전원끈다!!!");
		
	}


	@Override
	public void show() {
		System.out.println(getClass().getSimpleName()+"--show!!!");
		
	}


	@Override
	public void active() {
		// TODO Auto-generated method stub
		TV.super.active();
		System.out.println("===LG가 재정의함====");
	}
	//@Override
	static void staticMethod() {
		System.out.println("구현class가 재정의 불가..추가메서드");
	}
	
	
	
	
	
	
}

 