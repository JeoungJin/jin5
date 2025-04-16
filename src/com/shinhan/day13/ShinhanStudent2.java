package com.shinhan.day13;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class ShinhanStudent2 implements Comparable<ShinhanStudent2>{

	String name;
	int score;
	String gender;
	
	@Override
	public int compareTo(ShinhanStudent2 obj) {
		// TODO Auto-generated method stub
		return obj.score - score;  //desc
	}
}
