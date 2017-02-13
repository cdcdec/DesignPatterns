package com.aaron.factorymethod.second;

public class TestFactorySecond {

	public static void main(String[] args) {
		SendFactory factory = new SendFactory();  
        Sender sender = factory.produceMail();  
        sender.Send(); 
	}

}
