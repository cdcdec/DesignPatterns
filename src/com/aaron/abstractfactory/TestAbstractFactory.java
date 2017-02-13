package com.aaron.abstractfactory;

public class TestAbstractFactory {

	public static void main(String[] args) {
		Provider provider = new SendMailFactory();  
        Sender sender = provider.produce();  
        sender.Send();
	}

}
