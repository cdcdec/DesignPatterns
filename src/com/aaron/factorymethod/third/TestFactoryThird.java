package com.aaron.factorymethod.third;

public class TestFactoryThird {

	public static void main(String[] args) {
		Sender sender = SendFactory.produceMail();  
        sender.Send();  
	}

}
