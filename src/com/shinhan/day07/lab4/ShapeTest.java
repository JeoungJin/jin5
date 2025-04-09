package com.shinhan.day07.lab4;

public class ShapeTest {

	public static void main(String[] args) {
		
		Shape shape2 = new RectTriangle(6,2);
		double a = shape2.getArea();
		
		if(shape2 instanceof Rectangle r) {
			//Rectangle r = (Rectangle)shape2;
			r.resize(0.5);
		}
		
		
		
		
		
		Shape[] arr = new Shape[2];
		arr[0] = new Rectangle(5, 6);
		arr[1] = new RectTriangle(6,2);
		
		
	 
		for(Shape shape:arr) {
			System.out.println("area:" + shape.getArea());
			System.out.println("perimeter:" + shape.getPerimeter());
		
		    if(shape instanceof Resizable ) {
		    	Resizable resizeShape = (Resizable)shape;
		    	resizeShape.resize(0.5);
		    	System.out.println("new area:" + shape.getArea());
				System.out.println("new perimeter:" + shape.getPerimeter());
		    }
		}

	}

}

/*
 
H.	위의 2가지 Object를 배열에 추가합니다.
I.	순환문을 사용해서 배열에 들어 있는 각 Shape들의 area와 perimeter를 출력합니 다. 만일 해당 Shpae가 Resizable 하다면, 0.5 만큼 resize한 후 새로운 area와 perimeter를 출력합니다. (new area / new perimeter)




화면 출력(ShpeTest 실행):
area: 30.0
perimeter: 22.0


new area: 7.5
new perimeter: 11.0


area: 6.0
perimeter: 14.32455532033676

*/
