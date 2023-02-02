public class QueueAdapter {
	Prep1 list1 = new Prep1();
	
	int size() {
		return list1.size;
	}
	void add(int data) {
		list1.addNode(data);
	}
	
	void remove() {
		if(size()==0) {
			System.out.print("Queue underflow");
			
		}else
		{
	     list1.removeFirst();
	}
	}
	
	
   void top() {
	list1.getFirst();
    }
   
   void display1() {
	   list1.display();
   }
   
   
   
	public static void main(String[] args) {
		QueueAdapter queue=new QueueAdapter();
		queue.add(56);
		queue.add(89);
		queue.remove();
		
		queue.display1();
	}

}
