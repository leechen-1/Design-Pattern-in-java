package com.ibeifeng.ex2;

public class MainClass {
	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		Person zhangsan = new Man("张三",7,mediator);
		Person lisi = new Man("李四",7,mediator);
		Person xiaofang = new Woman("小芳",7,mediator);
		
		zhangsan.getPartner(lisi);
		
		xiaofang.getPartner(lisi);
	}
}
