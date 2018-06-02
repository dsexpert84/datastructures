package MaxDepth;

import java.util.Stack;

class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
class Solution {
	static int count;
    public int maxDepth(TreeNode root) {
    	TreeNode temp;
    	if(root==null)
    	{
    		return 0;
    	}
    	temp=root;
    	int rcount=1;
    	int lcount=1;
    	while(temp.right!=null)
    	{
    		temp=temp.right;
    		rcount++;
    	}
    	TreeNode ltemp;
    	ltemp=root;
    	while(ltemp.left!=null)
    	{
    		ltemp=ltemp.left;
    		lcount++;
    	}
    	
    	if(lcount>rcount)
    	{
    		return lcount;
    	}
    	else
    	{
    		return rcount;
    	}
    	
    	
    	
    }
    
    public static void main(String args[])
    {
    	TreeNode n=new TreeNode(1);
    	n.left=new TreeNode(2);
    	n.right=new TreeNode(3);
    	n.left.left=new TreeNode(4);
    	n.left.right=new TreeNode(5);
    	Solution s=new Solution();
    	int depth=s.maxDepth(n);
    	System.out.println("Max depth seen is "+depth);
    	
    }
}
