package com.shinhan.day11;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ResourceTest {

	public static void main(String[] args) throws IOException {
		method2();

	}

	private static void method2() throws IOException {
		Class cls = ResourceTest.class;
		URL url = cls.getResource("images/우리반.png");
		System.out.println(url.getPath());
		
		InputStream is =  cls.getResourceAsStream("aa/my.txt");
		int i;
		
		while((i = is.read())!=-1) {
			System.out.print((char)i);
		}
		
	}

	private static void method1() {
		//프로젝트가 default경로 
		//FileReader fr = new FileReader("src/com/shinhan/day11/PrintService.java");
		
		//현재class
		Class cls = ResourceTest.class;
        //URL url = cls.getResource("PrintAnnotation.class");		
		URL url = cls.getResource("aa/my.txt");
		
        System.out.println(url.getPath());
		
        
        
		
		
	}

}



