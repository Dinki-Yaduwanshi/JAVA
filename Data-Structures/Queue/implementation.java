package queue;


public class test {
	
	int front,rear;
  int capacity=6;
  int[] arr = new int[capacity];
  
	test(int capacity){
	 front=-1;
	 rear=-1;
	
	}
	
	void enque(int data) {
	if(rear==capacity-1) {
		System.out.println("full");
		}else if(rear==front && front==-1) {
			rear++;
			front++;
			arr[rear]=data;
		}else {
			rear++;
			arr[rear]=data;
		}
	
	}
	
	void display() {
		for(int i=front;i<=rear;i++) {
			System.out.println(arr[i]);
		}
	}
	
	int deque() {
		if(front==rear&&front==-1) {
			System.out.print("empty");
			return 0;
		}else {
			int val=arr[front];
		if(front==rear){
			front=-1;
			rear=-1;
		}else {
			front++;
		}
		}
		
		
		return 0;
	}

	public static void main(String[] args) {
	
	test q=new test(6);
	q.enque(56);
	q.enque(67);
	q.enque(78);
	q.enque(67);
	q.enque(90);
	q.enque(67);
	q.enque(89);
	q.display();
	System.out.println();
  q.deque();
  q.deque();
  q.display();
	}

}
