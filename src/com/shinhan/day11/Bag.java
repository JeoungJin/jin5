package com.shinhan.day11;

import lombok.AllArgsConstructor;
import lombok.Data;

//제네릭타입으로 변경하기 

@Data
@AllArgsConstructor
public class Bag<M,S,C> {
	M model;
	S size;
	C color;
	
}
