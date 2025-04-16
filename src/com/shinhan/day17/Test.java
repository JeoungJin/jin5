package com.shinhan.day17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("A");a.add("BC");a.add("CCC");a.add("DDD");
		System.out.println(a);

		Set<String> b = a.stream().collect(Collectors.toSet());
		System.out.println(b);
		//키중복시 오류 (길이 같으면(키가 같으면) 어떤것을 책택할지 지정) 
		Map<Integer,String> c = a.stream().collect(
				Collectors.toMap(String::length, Function.identity(),(s1, s2) -> s1 ) );
		System.out.println(c);
		
		
		Collector<String, Map<Integer, String>, Map<Integer, String>> customCollector = 
				Collector.of(
					HashMap::new, // supplier:
					(map, str) -> map.put(str.length(), str), // accumulator: 데이터 누적
					(map1, map2) -> {
						map1.putAll(map2);
						return map1;
					}, // combiner: 병합
				    Function.identity() // finisher: 그대로 반환
		        );

		Map<Integer, String> map = a.stream().collect(customCollector);
		System.out.println(map);
 

	}

}
