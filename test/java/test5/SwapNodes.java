package test5;

class ListNodes {
	int val;
	ListNodes next;

	ListNodes(int x) {
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
public class SwapNodes {

	public ListNodes swapPairs(ListNodes head) {

		ListNodes root;
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
		
		ListNodes nodes=new ListNodes(1);
		nodes.next=new ListNodes(2);
		nodes.next.next=new ListNodes(3);
		nodes.next.next.next=new ListNodes(4);
		SwapNodes s=new SwapNodes();
		ListNodes temp=s.swapPairs(nodes);
		while(temp!=null)
		{
			System.out.println(temp.val);
			temp=temp.next;
		}
	}

}
