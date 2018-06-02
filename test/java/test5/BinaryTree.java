package test5;

class ListNode
{
	ListNode left;
	ListNode right;
	int data;
	ListNode(int data)
	{
		this.data=data;
	}
}
public class BinaryTree {

	
	public void inorder(ListNode root)
	{
		if(root==null)
			return;
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	public static void main(String[] args) {

		 ListNode root=new  ListNode(1);
		 root.left=new  ListNode(2);
		 root.right=new  ListNode(3);
		 root.left.left=new  ListNode(4);
		 root.left.right=new  ListNode(5);
		 BinaryTree tree=new BinaryTree();
		 tree.inorder(root);
	}

}
