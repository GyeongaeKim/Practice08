package com.javaex.ex05;

public class Sub {

	//필드
    private int a;
    private int b;
    
    
    //생성자
    public Sub(int a, int b) {
    	this.a = a;
    	this.b = b;
    }
    
    
    //메소드
    public void setValue(int a, int b) {
    	this.a = a;
    	this.b = b;
    }

    public int calculate() {
    	int minus = a - b;
    	return minus;
    }

}
