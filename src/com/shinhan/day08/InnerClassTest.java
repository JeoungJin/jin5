package com.shinhan.day08;

//class의 구성요소 : field, constructor, method, block, inner class 
//변수 + 함수 
class OuterClass{
	int outerInstanceVar = 1;
	static int outerStaticVar = 2;
	void outerInstanceMethod() {
		System.out.println("outerInstanceVar:" + outerInstanceVar);
		System.out.println("outerStaticVar:" + outerStaticVar);
	}
	static void outerStaticMethod() {
		//불가 : System.out.println("outerInstanceVar:" + outerInstanceVar);
		System.out.println("outerStaticVar:" + outerStaticVar);
	}
	int score=100;
	class InnerClass{
		int score=200;
		int innerInstanceVar = 3;
		static int innerStaticVar = 4;
		
		InnerClass(){
			class LocalClass{}
			LocalClass aa = new LocalClass();
		}
		
		
		
		void innerInstanceMethod() {
			int score=300;
			System.out.println("outerInstanceVar:" + outerInstanceVar);
			System.out.println("outerStaticVar:" + outerStaticVar);
			System.out.println("innerInstanceVar:" + innerInstanceVar);
			System.out.println("innerStaticVar:" + innerStaticVar);
			System.out.println("local변수 score:" + score);
			System.out.println("inner class의 field score:" + this.score);
			System.out.println("outer class의 field score:" + OuterClass.this.score);
		}
		static void innerStaticMethod() {
			System.out.println("outerStaticVar:" + outerStaticVar);
			System.out.println("innerStaticVar:" + innerStaticVar);
		}
	}
	
	static class StaticInnerClass{
		int score=200;
		int innerInstanceVar = 3;
		static int innerStaticVar = 4;
		void innerInstanceMethod() {
			int score=300;
			//불가 System.out.println("outerInstanceVar:" + outerInstanceVar);
			System.out.println("outerStaticVar:" + outerStaticVar);
			System.out.println("innerInstanceVar:" + innerInstanceVar);
			System.out.println("innerStaticVar:" + innerStaticVar);
			System.out.println("local변수 score:" + score);
			System.out.println("inner class의 field score:" + this.score);
			//불가 System.out.println("outer class의 field score:" + OuterClass.this.score);
		}
		static void innerStaticMethod() {
			System.out.println("outerStaticVar:" + outerStaticVar);
			System.out.println("innerStaticVar:" + innerStaticVar);
		}
	}
	
}




public class InnerClassTest {
	
	InnerClassTest(){
		 class AA{
			 
		 }
	}
	
	int a=100;
	void f3() {
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		f2();
		
		String address = "마포구"; //지역변수는 Local class에서 사용하면 무조건 final이다.
		//address = "강남구";
		class LocalClass{
			String name;
			static String name2 = "자바";
			LocalClass(String name){
				this.name = name;
			}
			void f1() {
				
				InnerClassTest aa = new InnerClassTest();
				System.out.println(aa.a);
				aa.f3();
						
				
				System.out.println("local class name=" + name + name2);
				//address = "강남구";
				System.out.println("지역변수 address=" + address);
			}
			static void f2() {
				System.out.println("local class name2=" + name2);
			}
			
		}
		System.out.println(LocalClass.name2);
		LocalClass.f2();
		LocalClass aa = new LocalClass("커피");
		System.out.println(aa.name);
		aa.f1();
		///
		

	}

	private static void f2() {
		
		OuterClass.StaticInnerClass.innerStaticMethod();
		
		OuterClass.StaticInnerClass v1 = new OuterClass.StaticInnerClass();
		v1.innerInstanceMethod();
		
	}

	private static void f1() {
		
		System.out.println("===static접근=========");
		 System.out.println(OuterClass.InnerClass.innerStaticVar);
		 OuterClass.InnerClass.innerStaticMethod();
		
		 System.out.println("===instance접근=========");
		 
		 OuterClass outer = new OuterClass();
		 OuterClass.InnerClass inner = outer.new InnerClass();
		 System.out.println(inner.innerInstanceVar);
		 inner.innerInstanceMethod();
		 
		
	}

}











