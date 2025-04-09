package com.shinhan.day07;

public class Circle extends Shape{
   int radius;
   
   public Circle( int radius){
	   this.radius = radius;
   }
   
   
   public double getArea() {
		return radius*radius*Math.PI;
	}
   
}
