package com.aaron.state;

public class TestState {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		State state = new State();  
        Context context = new Context(state);  
          
        //设置第一种状态  
        state.setValue("state1");  
        context.method();  
          
        //设置第二种状态  
        state.setValue("state2");  
        context.method();  
    }
}

