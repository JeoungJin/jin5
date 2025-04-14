package com.shinhan.day10.aa;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode(of = {"menuName", "price"})
@ToString //(exclude = "price")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Coffee extends Object{
	String menuName;
	int price;
	 
	
}
