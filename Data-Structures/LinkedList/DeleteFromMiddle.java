public class DeleteFromMiddle {
public	int size;
class Node{
	int data;
	Node next;
	
	Node(int d){
		this.data=d;
		this.next=null;
	}
}	
	
public Node tail=null;
public Node head=null;

public void addNode(int data) {
	Node newNode=new Node(data);
	
	if(head==null) {
		head=newNode;
		tail=newNode;
	}
	else {
		tail.next=newNode;
		tail=newNode;
	}
	size++;
}
	
	public void Display() {
		Node current =head;
		//Node current points to head
		if(head==null) {
			System.out.print("List is Empty");
		}
		
		while(current!=null) {
			//print each node by incrementing pointer
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	
	//delete from  mid method
	public void DeleteFromMid() {
		Node temp,current;
		int count=0;
		//check list is empty
		if(head==null) {
			System.out.print("Empty list");
		}
		else{
			//store mid position
			count=(size%2==0)?(size/2):((size+1)/2);
		}
		//check if head and tail is equal 
		//if yes, list has only one node
		if(head!=tail) {
			temp=head;
			current=null;
			//current will point to previous node 
			// if temp points to second node
			//current points to first
			for(int i=0;i<count-1;i++) {
				current=temp;
				temp=temp.next;
			}
			if(current!=null) {
				//temp is the middle that needs to be removed
				//current node will point to node next to temp
				current.next=temp.next;
				//delete temp
				temp=null;
			}else //current points to null
				{head=temp.next;
				tail=temp.next;
				
				//delete temp
				temp=null;
			}
		}else //if list only one element
	        // remove it both head and tail point to null
			{
			head=tail=null;
			}
		        
		size--;
		}
	
	public static void main(String[] args) {
		DeleteFromMiddle list = new DeleteFromMiddle();
		list.addNode(23);
		list.addNode(56);
		list.addNode(0);
		list.addNode(40);
		
		System.out.print("Original list:");
		list.Display();
		
		while(list.head!=null) {
			list.DeleteFromMid();
			System.out.println("Updated list : ");
			list.Display();
			
		     }
     }

  }
