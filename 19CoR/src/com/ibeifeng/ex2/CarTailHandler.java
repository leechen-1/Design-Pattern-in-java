package com.ibeifeng.ex2;

public class CarTailHandler extends CarHandler{

	public void HandlerCar() {
		System.out.println("×é×°³µÎ²");
		if(this.carHandler != null) {
			this.carHandler.HandlerCar();
		}
	}

}
