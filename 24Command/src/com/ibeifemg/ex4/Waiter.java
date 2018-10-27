package com.ibeifemg.ex4;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
	private List<Command> commands = new ArrayList<Command>();


	public void setOrder(Command command) {
		commands.add(command);
	}

	public void removeOrder(Command command) {
		commands.remove(command);
	}
	
	public void sail() {
		for(Command command : commands) {
			command.sail();
		}
	}
}
