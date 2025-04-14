package com.shinhan.day09;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {

	public static void main(String[] args) {
		LocalDateTime a = LocalDateTime.now();
		System.out.println(a.getDayOfYear());
		System.out.println(a.getMonthValue());
		System.out.println(a.getDayOfMonth());
		System.out.println(a.plusDays(7));
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); //HH24시간 
		LocalDateTime b = LocalDateTime.parse("2025-04-11 12:00:00",formatter);
		System.out.println(b);

	}

}
