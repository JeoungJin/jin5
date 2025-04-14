package com.shinhan.day09;

import java.util.Properties;
import java.util.Set;

public class SystemInfoTest {

	public static void main(String[] args) {
		f1();

	}

	private static void f1() {
		//Map : python의 dict    entry(key, value)
		Properties  ps = System.getProperties();
		for(Object key :ps.keySet()) {
			String s = (String)key;
			System.out.println(s + "==>" + System.getProperty(s));
		}

		
	}

}






