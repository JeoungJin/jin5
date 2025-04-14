package com.shinhan.day09;

class MySum {
    int first;
    int second;
    
    MySum (int first, int second){
        this.first = first;
        this.second = second;
    }
    
    
    /* 조건1 toString()재정의*/
	@Override
	public String toString() {
		//return first + second + "";
		return String.valueOf(first + second);
	}
    /* 조건2 equals()재정의 */
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof MySum)) return false;
		MySum other = (MySum)obj;
		return  toString().equals(other.toString());
	}
	


}



public class OverridingTest {
	public static void main(String args[]) {
		int i = 10;
		int j = 20;
        String s1 = "30";
        
		MySum ms1 = new MySum(i, j);
		MySum ms2 = new MySum(i, j);

		System.out.println(ms1); //30
		System.out.println(ms1.toString()); //30 

		if (ms1.equals(ms2))
			System.out.println("ms1과 ms2의 합계는 동일합니다."); //OK
		else
			System.out.println("ms1과 ms2의 합계는 동일하지않습니다.");
		
		if (ms1.equals(s1))
			System.out.println("ms1과 s1의 합계는 동일합니다.");
		else
			System.out.println("ms1과 s1의 합계는 동일하지않습니다.");//OK
		
	}

}
