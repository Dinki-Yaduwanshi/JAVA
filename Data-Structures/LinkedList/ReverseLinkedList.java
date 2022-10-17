
public class ReverseLinkedList {

	public class Node{
		Node next;
		int data;
		
		Node(int d){
			this.data=d;
			this.next=null;
		}
	}
	public Node head=null;
	public Node tail=null;
	
	public void addNode(int data) {
		Node newNode=new Node(data);
		
		if(head==null) {
			tail=newNode;
			head=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	public void Reverse(Node current) {
		//check if list is empty
    if(head==null) {
	System.out.print("List is Empty");
	
           }	else {
        	   if(current.next==null) {
        		   System.out.print(current.data+" ");
        		   return;
        	   }
	  //recursively call reverse function
        	   
        	  Reverse(current.next);
        	 
        	  System.out.print(current.data+" ");
        	  return;
     }

	
	
	}
	
	
	
	
	
	public void Display() {
		System.out.print("Nodes in the list are : ");
		
		Node current =head;
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	
	
	
	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.addNode(23);
		list.addNode(45);
		list.addNode(56);
		
		list.Display();
		System.out.print("Reversed Linked List:");
		list.Reverse(list.head);

	}

}
