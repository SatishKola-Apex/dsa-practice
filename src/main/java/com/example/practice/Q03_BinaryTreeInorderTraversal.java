package com.example.practice;

public class Q03_BinaryTreeInorderTraversal {
	
	static class TreeNode{
		int data;
		TreeNode left, right;
		
		public TreeNode(int data) {
			this.data=data;
			this.left=this.right=null;
		}
	}
	
	public static void inorderTraversal(TreeNode root) {
		if(root==null) {
			return;
		}
		
		inorderTraversal(root.left);
		System.out.println(root.data+" ");
		inorderTraversal(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		//      1
       //      / \
       //     2   3
       //    / \
       //   4   5
		
		inorderTraversal(root);
	}

}
