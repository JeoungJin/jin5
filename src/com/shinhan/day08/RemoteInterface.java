package com.shinhan.day08;

//람다표현식도 가능한가 체크? 함수가 1개일때만 가능 
@FunctionalInterface
public interface RemoteInterface {

	public abstract String buttonClick(int a, int b);

}
