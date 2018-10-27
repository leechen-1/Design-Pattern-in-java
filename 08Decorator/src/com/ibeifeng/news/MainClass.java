package com.ibeifeng.news;

public class MainClass {
	public static void main(String[] args) {
		Car car = new RunCar();
		
		car.show();
		System.out.println("---------");
		
		Car swimcar = new SwimCarDecorator(car);
		swimcar.show();
		System.out.println("---------");
		
		Car flySwimCar = new FlyCarDecorator(swimcar);
		flySwimCar.show();
	}
}
