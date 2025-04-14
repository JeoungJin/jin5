package com.shinhan.day11;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@Setter
@Getter 
@AllArgsConstructor
@NoArgsConstructor
public class Product<A,B> {
	A model;
	B size;
	int price;
	

}
