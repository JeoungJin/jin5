package com.shinhan.day08.exception;


//사용자정의 Exception만들기 
public class MyException extends Exception{

	
	public MyException(String message){
		super(message); 
	}
}
