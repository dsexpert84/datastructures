package test5;

class Node
{
	Node next;
	int data;
	public Node(int data)
	{
		this.data=data;
	}
}
public class Queue {

	public Node insert(Node tail,int data)
	{
		Node temp=null;
		int a=10;
		int b;
		if(tail==null)
		{
			tail=new Node(data);
			return tail;
		}
		else
		{
			temp=tail;
			b=a;
			b=b+20;
			System.out.println("Value of a is "+a);
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new Node(data);
			//tail=temp;
		}
		return tail;
	}
	
	public void display(Node head)
	{
		while(head!=null)
		{
			System.out.println(head.data);
			head=head.next;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue q=new Queue();
		Node root = null;
		root=q.insert(root, 10);
		root=q.insert(root, 20);
		root=q.insert(root, 30);
		q.display(root);
	}

}
