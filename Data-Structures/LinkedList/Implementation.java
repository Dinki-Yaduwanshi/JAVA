public class Prep1 {

	public class Node{
		int data;
		Node next;
	}
	
  
		 Node head;
		Node tail;
		int size;
	
	
	
	 void addNode(int val) {
		Node temp=new Node();
		temp.data=val;
		temp.next=null;
		if(size==0) {
			head=tail=temp;
		}
		else {
			tail.next=temp;
			tail=temp;
			
		}
		size++;
	}
	
	
	void displaysize() {
		System.out.println(size); 
	}
	
	void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
			
		}
	}
	
	void removeFirst() {
		if(size==0) {
			System.out.print("Empty Linked List");
		}else if(size==1) {
			head=tail=null;
			size--;
			System.out.print("Linked list has zero element");
		}else {
			head=head.next;
			size--;
		}
	}
	
	void getFirst() {
		if(size==0) {
			System.out.print("Empty Linked List");
		}else {
		System.out.print(head.data);}
	}
	
	void getLast() {
		if(size==0) {
			System.out.print("Empty Linked List");
		}else {
		System.out.print(tail.data);}
	}
	
	void getValue(int idx) {
		if(size==0) {
			System.out.print("Empty Linked List");
		}else if(idx==0||idx>=size) {
			System.out.print("Invalid index");
		}else {
		Node temp=head;
		for(int i=0;i<idx;i++) {
		 
			temp=temp.next;
		}
		 System.out.print(temp.data);
		
	}
	}
	
	void addFirst(int data) {
		Node temp=new Node();
		temp.data=data;
		if(size==0) {
			temp.next=null;
			head=temp;
		}else {
		temp.next=head;
		head=temp;
		}
		size++;
	}
	
	void addIndex(int data,int v) {
		if (v<0||v>size) {
			System.out.print("Invalid size");
		}else if(v==0) {
			addFirst(data);
		}else if(v==size) {
			Node n=new Node();
		    n.data=data;
		    Node temp=head;
			for(int i=0;i<v;i++) {
				temp=temp.next;
				}
			temp.next=n;
			n.next=null;
		}else {
		
		Node n=new Node();
	    n.data=data;
	    Node temp=head;
		for(int i=0;i<v;i++) {
			temp=temp.next;
			}
		n.next=temp.next;
		temp.next=n;
		size++;
		}
		}
	
	
	
	void removeLast() {
			if(size==0) {                                  //size=0.no element to remove
				System.out.print("List is empty");
			}else if(size==1) {                             //only 1 element, set head and tail=null and decrement size
				head=tail=null;
						size=0;
			}else {                                        //for any number of size 
				Node temp=head;
				for(int i=0;i<size-2;i++) {                //traverse to second last node
					temp=temp.next;
				}
				temp.next=null;                            //set null to second last element next
				tail=temp;                                 //assign tail to second last element
				size--;                                    //size is decremented
			}
			}
		
		private Node getNode(int idx) {                    //a private method which can be used only within the class to get index node
			Node temp=head;
			for(int i=0;i<idx;i++) {
			 
				temp=temp.next;
			}
			return temp;
		}
		void reverseLinkedList1() {                       // linkedlist reversal(using data field)
			int li=0;                                     //left index =0
			int ei=size-1;                                //right index=size-1;
			while(li<ei) {                                // making a loop with both pointers
				Node left=getNode(li);                    //getting left node
				Node right=getNode(ei);                   //getting right node
				int temp=left.data;                       //swapping both of their data
				left.data=right.data;
				right.data=temp;
				
				li++;                                    //moving left forward
				ei--;                                    //moving end backward
			}
			Node temp=head;
			head=tail;
			tail=temp;
			
			display();
		}
		
		public void reverseLinkedList2() {              //using next node
			Node previous=null; //Node previous is set null;
			Node current=head; //Node current is on head;
			
			while(current!=null) {
				Node temp=current.next;
				current.next=previous;
				current=temp;
				previous.next=current;
			}
			Node temp=head;
			head=tail;
			tail=temp;
			
			
			display();
			
			
		}
	

		
	 public static void main(String[] args) {
		Prep1 p = new Prep1();
		
		p.addFirst(56);
		p.addFirst(67);
		p.addFirst(12);
		

	p.addIndex(78,1);
	p.display();
			
		

	}
}
