package com.shinhan.day14;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Student {

	private String name;
	private int englishScore;
	private int mathScore;

}

@FunctionalInterface
interface Function<T> {
	public double apply(T t);
}
