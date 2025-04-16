package com.shinhan.day13;


public class Button {

	//inner class, inner interface
	public static interface ClickListener{
		public abstract void onClick();
	}

	
	//1.field
	private ClickListener clickListener;
	//2.생성자----default생성자
	//3.일반메서드
	void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	//이 버튼의 동작(Listener)을 구현class에서 정한다. 
	//click()메서드에서 그 동작을 호출한다. 
	void click() {
		clickListener.onClick();
	}
}
