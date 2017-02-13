package com.aaron.command;
/**
 * MyCommand是命令，实现了Command接口，持有接收对象.
 * **/
public class MyCommand implements Command {
	private Receiver receiver;
	public MyCommand(Receiver receiver) {
		this.receiver = receiver;
	}
	@Override
	public void exe() {
		receiver.action();
	}
}
