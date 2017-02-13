package com.aaron.abstractfactory;
/**
 * 建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 * **/
public class SendSmsFactory implements Provider{

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}
	

}
