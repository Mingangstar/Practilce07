package com.javaex.ex02;

public class Sparrow extends Bird {
	// name 필드, getter, setters는 부모로부터 상속
	
	// 추상 메서드 오버라이드
	@Override
	public void sing() {
		System.out.println("참새(" + getName() + ")가 소리내어 웁니다.");
	}
	
	@Override
	public void fly() {
		System.out.println("참새(" + getName() + ")가 날아 다닙니다.");
	}
	
	@Override
	public void showName) {
		System.out.println("참새(" + getName() + "입니다.");

	}	
}
