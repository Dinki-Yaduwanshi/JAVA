public class DeleteNode {
	
	public class Node{
		int data;
		Node next;
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
			head=newNode;
		tail=newNode;
		}else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	
	public void Display() {
		Node current=head;
		
		if(head==null) {
			System.out.print("List is empty");
			return ;
			}
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	public void Delete() {
		if(head==null) {
			System.out.print("List is empty");
			return ;
			}else if(head!=tail) {
				head=head.next;
			}else {
				head=null;
				tail=null;
			}
		
	}
	
	
	public static void main(String[] args) {
		DeleteNode list=new DeleteNode();
		list.addNode(12);
		list.addNode(45);
		list.addNode(56);
		
		list.Delete();
		list.Display();

	}

}
