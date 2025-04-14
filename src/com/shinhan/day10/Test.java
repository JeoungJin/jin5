package com.shinhan.day10;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Test {

	public static void main(String[] args) {
		 
		String str = "everyday we have is one more than we deserve";
		char[] arr = str.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ' ') continue;
			
			arr[i] += 3;
			if(arr[i] > 'z') arr[i] = (char)('a' + arr[i] - 'z' + 1);
			
//			if(arr[i] == 'x' || arr[i] == 'y' || arr[i] == 'z') {
//				arr[i] -= 23;
//			} else {
//				arr[i] += 3;
//			}
		}
		
		String ans = String.valueOf(arr);
		System.out.println(ans);
	}
		

	 

}
 