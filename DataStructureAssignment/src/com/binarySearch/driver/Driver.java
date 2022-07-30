package com.binarySearch.driver;

import com.binarySearch.service.Binary;
import com.binarySearch.service.Node;

public class Driver {
	
	
	
	public static void main(String[] args) {
		Binary binary=new Binary();
		
		Node tree = new Node(50);
		tree.left=new Node(30);
		tree.right=new Node(60);
		tree.left.left=new Node(10);
		tree.right.left=new Node(55);
		
		binary.binaryTree(tree);
		
		binary.display(binary.headNode);
		
		
		
		
		
		
	}

}
