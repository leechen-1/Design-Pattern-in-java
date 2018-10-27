package com.ibeifemg.ex2;

public abstract class Command {
	private Peddler peddler;
	
	
	public Command(Peddler peddler) {
		this.peddler = peddler;
	}
	
	public Peddler getPeddler() {
		return peddler;
	}

	public void setPeddler(Peddler peddler) {
		this.peddler = peddler;
	}

	public abstract void sail();
}
