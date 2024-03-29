package com.javaex.ex02;

public abstract class Bird {
    private String name;

    protected String getName() {
    	return this.name;
    }
    
    protected void setName(String name) {
    	this.name = name;
    }
    
    // Duck과 Sparraow 가 공통적으로 가진 메서드의 설계를 추상메서드로 분리
    public abstract void sin();
    public abstract void fly();
    public abstract void showName()

}
