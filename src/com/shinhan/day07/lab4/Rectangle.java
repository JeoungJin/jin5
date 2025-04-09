package com.shinhan.day07.lab4;

public class Rectangle extends Shape 
    implements Resizable{

	private double width;
	private double height;
	Rectangle(double width, double height){
		super(4);
		this.width = width;
		this.height = height;
	}
	@Override
	public void resize(double s) {
		width *= s;
		height = height * s;
		
	}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}
	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(width + height);
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
