package com.ibeifeng.ex3;

public class LState extends State{

	public void doSomething(Person person) {
		if(person.getHour() == 12) {
			System.out.println("≥‘÷–∑π");
		} else {
			person.setState(new SState());
			person.doSomething();
		}
	}

}
