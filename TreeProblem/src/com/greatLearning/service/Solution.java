package com.greatLearning.service;

import com.greatLearning.node.Node;

public class Solution {

//Global variable headNode to store the root of the created skewed-tree.
//Global variable prevNode is used for making new connections.
	static Node prevNode = null;
	static Node headNode = null;

// GETTER function for headNode.
	public static Node getHeadNode() {
		return headNode;
	}

	public void BST_to_skewed(Node root) {
		if (root == null)
			return;

//Calling for left-subtree of main tree created in driver function.
		BST_to_skewed(root.left);

//Storing the right node for calling the right-subtree of main tree.
		Node rightnode = root.right;

//Condition to check if the root Node of the skewed tree is defined or not.
		if (headNode == null) {
			headNode = root;
			prevNode = root;
		}
//Making our connections for skewed-tree.			
		else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

//Calling for right-subtree of main tree.
		BST_to_skewed(rightnode);
	}

//Function for printing the skewed-tree data.
	public void Traverse(Node root) {
		while (root != null) {
			System.out.print(root.getData() + " ");
			root = root.right;
		}
	}

}