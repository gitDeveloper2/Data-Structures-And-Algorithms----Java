package com.dsa.datastructures.tree;

public class Tree {
	static int count=0;
	public  int sum(MyNode root) {
		
			if (root==null) {
				return 0;
			}
			System.out.println(root.getData());
		return root.getData() +sum(root.getRight())+ sum(root.getLeft()) ;

	}

	public static void main(String[] args) {

		MyNode n2 = new MyNode(2);
		MyNode n3 = new MyNode(3);
		MyNode n4 = new MyNode(4);
		MyNode n5 = new MyNode(5);
		MyNode n6 = new MyNode(6);
		n2.setLeft(n3);
		n2.setRight(n4);
		n3.setLeft(n5);
		n3.setRight(n6);
		Tree t = new Tree();
		System.out.println(t.sum(n2));
		

	}
}
