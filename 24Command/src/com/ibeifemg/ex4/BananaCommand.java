package com.ibeifemg.ex4;

public class BananaCommand extends Command{

	public BananaCommand(Peddler peddler) {
		super(peddler);
	}

	public void sail() {
		this.getPeddler().sailBanana();
	}

}
