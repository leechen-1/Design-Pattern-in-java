package com.ibeifeng.ex3;

public class MState extends State {

	public void doSomething(Person person) {
		if(person.getHour() == 7) {
			System.out.println("≥‘‘Á≤Õ");
		} else {
			person.setState(new LState());
			person.doSomething();
		}
	}

}
