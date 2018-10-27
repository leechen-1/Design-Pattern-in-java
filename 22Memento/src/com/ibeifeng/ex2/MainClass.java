package com.ibeifeng.ex2;

public class MainClass {
	public static void main(String[] args) {
		Person per = new Person("lifengxing","ÄĞ",24);
		
//		Memento memento = per.createMemento();
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(per.createMemento());
		
		per.display();
		
		per.setName("beifeng");
		per.setSex("Å®");
		per.setAge(1);
		
		per.display();
		
		per.setMemento(caretaker.getMemento());
		per.display();
		
	}
}
