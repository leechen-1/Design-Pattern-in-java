package com.ibeifeng.news;

public class SwimCarDecorator extends CarDecorator {

	public SwimCarDecorator(Car car) {
		super(car);
	}

	public void show() {
		this.getCar().show();
		this.swim();
	}
	
	public void swim() {
		System.out.println("©иртсн");
	}

	public void run() {
		
	}

}
