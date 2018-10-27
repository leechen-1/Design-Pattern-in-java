package com.ibeifemg.ex4;

public class MainClass {
	public static void main(String[] args) {
		Peddler peddler = new Peddler();
//		peddler.sailApple();
//		peddler.sailBanana();
		
		Command appleCommand = new AppleCommand(peddler);
		Command bananaCommand = new BananaCommand(peddler);
//		appleCommand.sail();
//		bananaCommand.sail();
		Waiter waiter = new Waiter();
		
		//ÏÂ¶©µ¥
		waiter.setOrder(appleCommand);
		waiter.setOrder(bananaCommand);
		
		//ÒÆ³ý¶©µ¥Ä³Ïî
		waiter.removeOrder(appleCommand);
		
		waiter.sail();
	}
}
