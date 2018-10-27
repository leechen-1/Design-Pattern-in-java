package com.ibeifeng.ex1;

public class MainClass {
	public static void main(String[] args) {
		Person zhangsan = new Man("张三",5);
		Person lisi = new Man("李四",6);
		
		Person xiaofang = new Woman("小芳", 6);
		
		zhangsan.getPartner(xiaofang);
		lisi.getPartner(xiaofang);
		zhangsan.getPartner(lisi);
		
	}
}	
