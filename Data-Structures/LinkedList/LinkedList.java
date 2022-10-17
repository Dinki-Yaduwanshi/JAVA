public class LinkedList {
	Node head;//head of list
	static class Node{
		int data;
		Node next;
		Node (int d){
			data=d;
			next=null;
			}
	}
	
	public void display() {//function to display contents of linked list
		Node n =head;
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
	}

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.head=new Node(100);
		Node second=new Node(200);
		Node third=new Node(300);
		
		list.head.next=second;//linked list node with the second
		second.next=third;//linked second node with third
		list.display();
    
	}

}
