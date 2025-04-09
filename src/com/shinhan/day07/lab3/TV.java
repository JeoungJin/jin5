package com.shinhan.day07.lab3;

public class TV implements Volume{
	int volLevel;
	 
	@Override
	public void volumeUp(int level) {
		volLevel += level;
	
		System.out.println( getClass().getSimpleName() + "볼륨 올립니다." +volLevel);
	}

	@Override
	public void volumeDown(int level) {
		volLevel -=level; 
		if(volLevel<0) volLevel = 0;
		System.out.println(getClass().getSimpleName() + "볼륨 내립니다" + volLevel);
	}

}

