package com.ibeifeng.news;

public class FlyCarDecorator extends CarDecorator{

	public FlyCarDecorator(Car car) {
		super(car);
	}

	public void show() {
		this.getCar().show();
		this.fly();
	}
	
	public void fly() {
		System.out.println("©ирт╥и");
	}

	public void run() {
		
	}
}
