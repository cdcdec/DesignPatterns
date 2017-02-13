package com.aaron.decorator;
/**
 * 测试装饰类
 * **/
public class TestDecorator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Sourceable source = new Source();  
	     Sourceable obj = new Decorator(source);  
	     obj.method();
	}

}
