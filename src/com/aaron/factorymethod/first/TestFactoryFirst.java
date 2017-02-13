package com.aaron.factorymethod.first;

public class TestFactoryFirst {

	public static void main(String[] args) {
		SendFactory factory = new SendFactory();  
        Sender sender = factory.produce("sms");  
        sender.Send();
	}

}
