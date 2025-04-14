package com.shinhan.day09;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@AllArgsConstructor
@RequiredArgsConstructor //필수(final) field를 초기화하는 생성자를 만들기 
@EqualsAndHashCode(of = {"model"})
public class CellPhone {
	private final String model;	// 핸드폰 모델 번호
	private double battery;	// 남은 배터리 양
	
	/*
	public CellPhone(String model){
		this.model = model;
	}*/
	
	//RuntimeException은 자동으로 던져짐 
	void  call(int time) {
		if(time<0) throw new IllegalArgumentException("통화시간입력오류");
		System.out.printf("통화 시간 : %d분\n", time);
		battery -= time * 0.5;
		if(battery < 0) battery = 0;
	}
	void  printBattery() {
		System.out.printf("남은 배터리 양 : %3.1f\n", battery);
	}
	void  charge(int time) {
		if(time<0) throw new IllegalArgumentException("충전시간입력오류");
		System.out.printf("충전 시간 : %d분\n", time);
		battery += time * 3;
		if(battery > 100) battery = 100;
	}
	//재정의(override) : 이름, 매개변수, return이 같아야한다. modifier는 같거나 더 넓어져야한다. 
	/*
	public boolean equals(Object obj) {
		if(!(obj instanceof CellPhone)) return false;
		
		CellPhone otherCellphone = (CellPhone)obj; 
		if(model.equals(otherCellphone.model)) return true;
		return false;
	}
	*/
}
 
