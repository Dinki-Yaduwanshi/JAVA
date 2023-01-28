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
		
	 public static void main(String[] args) {
		Prep1 p = new Prep1();
		
		p.addFirst(56);
		p.addFirst(67);
		p.addFirst(12);
		

	p.addIndex(78,1);
	p.display();
			
		

	}
}
