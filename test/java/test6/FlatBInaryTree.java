
package test6;

import java.util.LinkedList;

/**
 * Flat Binary Tree
 * @author asharda
 *
 */
public class FlatBInaryTree {

	static LinkedList<Integer> list=new LinkedList<Integer>();
	 public void flatten(TreeNode root) {
		 
		  
		 if(root==null)
		 {
			 return ;
		 }
		 if(root==null)
		 {
			 list.add(root.val);
		 }
		 	 list.add(root.val);
			 flatten(root.left);
			 flatten(root.right);
		 
		
		 }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TreeNode node=new TreeNode(1);
		node.left=new TreeNode(2);
		node.right=new TreeNode(5);
		node.left.left=new TreeNode(3);
		node.left.right=new TreeNode(4);
		node.right.right=new TreeNode(6);
		
		FlatBInaryTree t=new FlatBInaryTree();
		t.flatten(node);
		for(Integer i:list)
			System.out.println(i);

	}

}
