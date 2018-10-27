package com.ibeifeng.ex2;

public class MainClass {
	public static void main(String[] args) {
		CarHandler headH = new CarHeadHandler();
		CarHandler bodyH = new CarBodyHandler();
		CarHandler tailH = new CarTailHandler();

		//组装顺序预先设定好,顺序是车头-->车身-->车尾
		headH.setNextHandler(bodyH);
		bodyH.setNextHandler(tailH);
		
		//调用职责链的链头来完成操作
		headH.HandlerCar();
		
		System.out.println("---------------");
		
		//顺序改变，希望是车身-->车头--车尾
		bodyH.setNextHandler(headH);
		headH.setNextHandler(tailH);
		bodyH.HandlerCar();
		
		//简便操作
		bodyH.setNextHandler(headH).setNextHandler(tailH);
		bodyH.HandlerCar();
		
		
	}
}
