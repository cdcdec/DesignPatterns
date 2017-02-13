package com.aaron.iterator;
public class TestIterator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection collection = new MyCollection();  
        Iterator it = collection.iterator();  
        while(it.hasNext()){  
            System.out.println(it.next());  
        }  
	}
}
