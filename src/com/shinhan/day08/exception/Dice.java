package com.shinhan.day08.exception;

class Dice {
	int size;

	Dice(int size) {
		this.size = size;
	}

	int play() {
		int number = (int) (Math.random() * size) + 1; //1<=   <9
		return number;
	}
}
