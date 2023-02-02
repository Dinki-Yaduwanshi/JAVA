public class StackAdapter {
	Prep1 list1 = new Prep1();
	
	int size() {
		return list1.size;
	}
	void push(int data) {
		list1.addFirst(data);
	}
	
	void pop() {
		if(size()==0) {
			System.out.print("List underflow");
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
		StackAdapter stack=new StackAdapter();
		stack.push(56);
		stack.push(89);
	
		
		stack.display1();
		stack.pop();
		stack.display1();
	}

}
