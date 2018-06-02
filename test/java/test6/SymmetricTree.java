package test6;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class SymmetricTree {

	public boolean isSymmetric(TreeNode root) {
		TreeNode lnode=root;
		TreeNode rnode=root;
//		while(lnode!=null)
//		{
//			System.out.println(lnode.val);
//			lnode=lnode.left;
//		}
		boolean flag=false;
		while(lnode!=null && rnode!=null)
		{
			if(lnode.val==rnode.val)
			{
				flag= true;
				if(lnode.right!=null && rnode.left!=null)
				{
					if(lnode.right.val==rnode.left.val)
					{
						flag=true;
					}
					else
					{
						flag=false;
					}
				}
				
			}
			else
			{
				flag=false;
			}
			lnode=lnode.left;
			rnode=rnode.right;
		}
		return flag;
	}

	public static void main(String[] args) {
		TreeNode node=new TreeNode(1);
		node.left=new TreeNode(2);
		node.right=new TreeNode(2);
		node.left.left=new TreeNode(3);
		node.left.right=new TreeNode(4);
		node.right.left=new TreeNode(4);
		node.right.right=new TreeNode(5);
		SymmetricTree s=new SymmetricTree();
		System.out.println(s.isSymmetric(node));
	}

}
