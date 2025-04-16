package com.shinhan.day13;

public class ButtonExample {

	public static void main(String[] args) {
		//1.구현class사용 
		Button saveButton = new Button();
		SaveListener listener = new SaveListener();
		saveButton.setClickListener(listener);
		saveButton.click();
		//2.익명
		
		Button okButton = new Button();
		Button.ClickListener listener2 = new Button.ClickListener() {		
			@Override
			public void onClick() {
				System.out.println("2.익명구현class만들기....OK버튼입니다.");				
			}
		};
		okButton.setClickListener(listener2);
		okButton.click();
		//3.람다표현식 
		Button cancelButton = new Button();
		Button.ClickListener listener3 = ()->{
			System.out.println("3.람다표현식으로 익명구현class만들기....Cancel버튼입니다.");		
		};
		cancelButton.setClickListener(listener3);
		cancelButton.click();
		System.out.println("------------------------------");
		work(listener);
		work(listener2);
		work(listener3);
	}
	
	public static void work(Button.ClickListener listener ) {
		Button button = new Button();
		//button에 listener를 넣는다.
		button.setClickListener(listener);
		//button을 클릭한다. 
		button.click();
	}

}




