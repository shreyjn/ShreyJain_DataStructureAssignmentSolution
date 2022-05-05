package com.greatLearning.node;

public class Node {
	int data;
	public Node left;
	public Node right;

	public Node(int value) {
		// TODO Auto-generated constructor stub
		this.data = value;
		this.left = null;
		this.right = null;
	}

//Getter function to access value of data field of node.
	public int getData() {
		return data;
	}

}
