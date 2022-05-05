package com.greatLearning.main;

import com.greatLearning.Tree.BST;
import com.greatLearning.node.Node;
import com.greatLearning.service.Solution;

public class Driver {

	public static void main(String[] args) {

//Creating the Binary Search Tree.
		BST tree = new BST();
		tree.root = new Node(50);
		tree.root.left = new Node(30);
		tree.root.right = new Node(60);
		tree.root.left.left = new Node(10);
		tree.root.right.left = new Node(55);
		tree.root.right.right = new Node(70);
		tree.root.right.right.left = new Node(62);

		Solution obj = new Solution();

//Function call to convert BST to right-skewed tree.
		obj.BST_to_skewed(tree.root);

//Root of the newly created Skewed-tree (stored in headNode), is accessed through getter function.		
		obj.Traverse(Solution.getHeadNode());

	}
}
