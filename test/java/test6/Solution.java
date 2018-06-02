package test6;


class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

/**
 * 
 * while(node!=null) { int temp=node.next.data; node.next.data=temp.data
 * node.data=temp node.next.next }
 * 
 * @author asharda
 *
 */
public class Solution {

	public ListNode swapPairs(ListNode head) {

		ListNode root;
		root=head;
		while(root!=null)
		{
		int temp;	
		temp=root.next.val;
		root.next.val=root.val;
		root.val=temp;
		root=root.next.next;
		}//end of while
		
		return head;
	}

	public static void main(String[] args) {
		
		ListNode nodes=new ListNode(1);
		nodes.next=new ListNode(2);
		nodes.next.next=new ListNode(3);
		nodes.next.next.next=new ListNode(4);
		nodes.next.next.next.next=new ListNode(5);
		nodes.next.next.next.next.next=new ListNode(6);
		Solution s=new Solution();
		ListNode temp=s.swapPairs(nodes);
		while(temp!=null)
		{
			System.out.println(temp.val);
			temp=temp.next;
		}
	}

}
