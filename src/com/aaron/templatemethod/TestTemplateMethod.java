package com.aaron.templatemethod;

public class TestTemplateMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "8+8";  
        AbstractCalculator cal = new Plus();  
        int result = cal.calculate(exp, "\\+");  
        System.out.println(result);

	}

}
