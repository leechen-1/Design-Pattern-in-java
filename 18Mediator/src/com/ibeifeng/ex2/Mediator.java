package com.ibeifeng.ex2;

public class Mediator {
	private Man man;
	private Woman woman;
	
	public void setMan(Man man) {
		this.man = man;
	}
	public void setWoman(Woman woman) {
		this.woman = woman;
	}
	
	public void getPartner(Person person) {
		//将搭档设置上
		if(person instanceof Man) {
			this.setMan((Man)person);
		} else {
			this.setWoman((Woman)person);
		}
		//判断条件
		if(man == null || woman == null) {
			System.out.println("汗，我不是同性恋!");
		} else {
			
			if(man.getCondition() == woman.getCondition()) {
				System.out.println(man.getName() + "和" + woman.getName() + "绝配");
			} else {
				System.out.println(man.getName() + "和" + woman.getName() + "不相配");
			}
		}
	}
	
}
