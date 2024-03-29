package com.javaex.ex02;

public class Duck extends Bird {
	
	@Override
    public void sing() {
		System.out.println("오리(" + getName() + ")가 소리내어 웁니다.");
    }
	@Override
    public void fly() {
    	System.out.println("오리(" + getName() + ")가 하늘을 날 수 없습니다.");
    
    }
	@Override
    public void showName() {
    	System.out.println("오리의 이름은" + getName() + "입니다.");
    }

}
