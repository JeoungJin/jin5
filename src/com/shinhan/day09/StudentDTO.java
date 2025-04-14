package com.shinhan.day09;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//DTO(Data Transfer Object)
//@ToString
//@EqualsAndHashCode(of = {"stdId"})
//@Getter@Setter
//@AllArgsConstructor
//@RequiredArgsConstructor

//Annotation 사용은 순서 상관없음 
@EqualsAndHashCode(of = {"stdId"})
@AllArgsConstructor
@Data //getter, setter, default생성자(또는 required생성자), equals
@RequiredArgsConstructor
public class StudentDTO {

	private final String stdId;
	private final String name;
	private String major;
	private int grade;
	
	
	int getGrade() {
		return grade+1;
	}
	
	
}







