package com.aaron.composite;

public class TestComposite {
	
	 TreeNode root = null;  
	  
	    public TestComposite(String name) {  
	        root = new TreeNode(name);  
	    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestComposite tree = new TestComposite("A");  
        TreeNode nodeB = new TreeNode("B");  
        TreeNode nodeC = new TreeNode("C");  
          
        nodeB.add(nodeC);  
        tree.root.add(nodeB);  
        System.out.println("build the tree finished!");  

	}

}
