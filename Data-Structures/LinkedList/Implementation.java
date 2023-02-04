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
			
			while(current!=null) {//till current becomes null
				Node temp=current.next; //save the current next node
				current.next=previous;  //point the next node to previous
				previous=current;      //previous moves to current
				current=temp;         //current jumps on next element
			}
			Node temp=head;           //swap head and tail
			head=tail;
			tail=temp;
			
			
			display();               //call display
			}
		
		
		void removeAt(int idx) {
			
			if(idx<0||idx>size) {   //if index is negative or size is more 
				System.out.print("Invalid index");
			}else if(size==0) {     //empty linked list
				System.out.print("Empty linked list"); 
				
			}else if(idx==0) {      //first element to be removed
				removeFirst();
			}else if(idx==size-1) { //last element to be removed
				removeLast();
			}else {                 //in between linked list
				Node temp=head;
				for(int i=0;i<idx-1;i++) { //traverse till index-1
					temp=temp.next;        
				}
				temp.next=temp.next.next;  //set next to be next of the index
				size--;                    //size decremented
			}
		}
                
	void returnFromLast(int idx) { //2pointer solution
			Node slow= head;
			Node fast=head;
			
			for(int i=0;i<idx;i++) {
				fast=fast.next;
			}
			
			while(fast!=null) {
				slow=slow.next;
				fast=fast.next;
			}
			
			System.out.print(slow.data);
		}
	
	
		
		public void returnMiddle() {
			Node start= new Node();
			start.next=head;
			Node slow=head;;
			Node fast=head;
			
			while(fast.next!=null&&fast.next.next!=null) {
				slow=slow.next;
				fast=fast.next.next;
			}
			
			System.out.print(slow.data);
		}
		
	
	
		void mergeSortedList(Prep1 a,Prep1 b) {
			Node first=a.head;
			Node sec=b.head;
			
			Prep1 list=new Prep1();
			while(first!=null&&sec!=null) {
				if(first.data<sec.data) {
					list.addNode(first.data);
					first=first.next;
				}else {
					list.addNode(sec.data);
					sec=sec.next;
				}
			}
			
			while(first!=null) {
				list.addNode(first.data);
				first=first.next;
			}
			
			while(sec!=null) {
				list.addNode(sec.data);
				sec=sec.next;
			}
			
			list.display();
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
