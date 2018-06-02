package test6;

public class PathSum {

	 public boolean hasPathSum(TreeNode root, int sum) {
		 TreeNode lptr=root.left;
		 TreeNode rptr=root;
		 int ltemp=root.val;
		 boolean flag=false;
		 while(lptr!=null)
		 {
			 ltemp=ltemp+lptr.val;
			 if(ltemp==sum)
			 {
				 flag=true;
				 //return true;
			 }
			 if(lptr.right!=null)
			 {
				 ltemp=ltemp+lptr.right.val;
				 if(ltemp==sum)
				 {
					 flag=true;
				 }
			 }
			 lptr=lptr.left;
		 }
		return flag;
	        
	    }
	public static void main(String[] args) {

		TreeNode node=new TreeNode(5);
		node.left=new TreeNode(4);
		node.right=new TreeNode(8);
		node.left.left=new TreeNode(11);
		node.left.left.left=new TreeNode(7);
		node.left.left.right=new TreeNode(2);
		node.right.left=new TreeNode(13);
		node.right.right=new TreeNode(4);
		node.right.right.right=new TreeNode(1);
		PathSum p=new PathSum();
		System.out.println(p.hasPathSum(node, 22));
	}

}
