public class Example {
 class Node{
	 Node next;
	 int data;
	
	 public Node(int d) { 
	 data=d;
	 next=null;
 }
 }
 
 public Node head=null;
 public Node tail=null;
 
 //addNode function
 public void addNode(int data) {
	 //create new node
	 Node newNode=new Node(data);
	 //check if list is empty
	 if(head==null) {
		 head=newNode;
		 tail=newNode;
	 }else {
		 
		 //newNode will be added after current tail
		 tail.next=newNode;
		 //new node will become new tail of linked list
         tail=newNode;		 
	 }
	 
 }
 
 public void display() {
	 //Node current will point to head 
	 Node current=head;
	 
	 if(head==null) {
		 System.out.print("List is Empty");
		 return;
	 }
	 System.out.println("Nodes of single linked list are : ");
	 while(current!=null) {
		 System.out.print(current.data+" ");
		 current=current.next;
	 }
	 System.out.println();
 }
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Example list=new Example();
  list.addNode(1);
  list.addNode(2);
  list.addNode(3);
  
  //display
  list.display();
	}

}
