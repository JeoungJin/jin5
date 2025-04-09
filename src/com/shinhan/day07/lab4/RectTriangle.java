package com.shinhan.day07.lab4;

public class RectTriangle extends Shape{

	double width, height;
	
	RectTriangle(double width, double height){
		super(3);
		this.width = width;
		this.height = height;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return width*height/2;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return width + height + Math.sqrt(width*width + height*height);
	}
}
