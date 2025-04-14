package com.shinhan.day08;

public class RemoteA implements RemoteInterface{

	@Override
	public String buttonClick(int a, int b) {
		// TODO Auto-generated method stub
		return "구현class RemoteA=" + (a+b);
	}

}
