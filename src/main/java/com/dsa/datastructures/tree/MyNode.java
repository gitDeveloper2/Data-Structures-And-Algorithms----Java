package com.dsa.datastructures.tree;


public class MyNode{
		int data;
		MyNode left;
		MyNode right;
		
		public MyNode(int data) {
			super();
			this.data = data;
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public MyNode getLeft() {
			return left;
		}
		public void setLeft(MyNode left) {
			this.left = left;
		}
		public MyNode getRight() {
			return right;
		}
		public void setRight(MyNode right) {
			this.right = right;
		}
		
	}
	