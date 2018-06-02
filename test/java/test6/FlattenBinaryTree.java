package test6;

import java.util.LinkedList;

public class FlattenBinaryTree {

	 public void flatten(TreeNode root) {
		 TreeNode ltemp,rtemp;
		 ltemp=root.left;
		 rtemp=root.right;
		 LinkedList<Integer> list=new LinkedList<Integer>();
		 //iterate over ltemp
		 list.add(root.val);
		 while(ltemp!=null)
		 {
			 list.add(ltemp.val);
			 if((ltemp.left!=null) &&(ltemp.right!=null))
			 {
				 list.add(ltemp.left.val);
				 list.add(ltemp.right.val);
				 ltemp=ltemp.left.left;
			 }
			 else
			 {
				 ltemp=ltemp.left;
			 }
			 
		 }
		 
		 //iterate over rtemp
		 while(rtemp!=null)
		 {
			 list.add(rtemp.val);
			 if((rtemp.left!=null) &&(rtemp.right!=null))
			 {
				 list.add(rtemp.left.val);
				 list.add(rtemp.right.val);
				 rtemp=rtemp.right.right;
			 }
			 else
			 {
				 rtemp=rtemp.right;
			 }
			 
		 }
		 
		 for(int i:list)
		 {
			 System.out.println(i);
		 }
		 
	    }
	public static void main(String[] args) {
	
		TreeNode node=new TreeNode(1);
		node.left=new TreeNode(2);
		node.right=new TreeNode(5);
		node.left.left=new TreeNode(3);
		node.left.right=new TreeNode(4);
		node.right.right=new TreeNode(6);
		FlattenBinaryTree t=new FlattenBinaryTree();
		t.flatten(node);
	}

}
