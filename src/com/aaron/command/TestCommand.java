package com.aaron.command;

public class TestCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//接收者
		Receiver receiver = new Receiver();
		//命令
		Command cmd = new MyCommand(receiver);
		//调用者
		Invoker invoker = new Invoker(cmd);
		invoker.action();
	}
}
