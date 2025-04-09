package com.shinhan.day07.lab5;

public class SoundableExample {
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
		
		Soundable soundable = new Dog();
		soundable.sound();
		
		if(soundable instanceof Cat cat) {
			//Cat cat = (Cat)soundable;
			cat.call();
		}
		
		
	}
}
