public class StackA {
    int[] stack;
	int data;
	int top;
	int size;
	
	StackA(int s){
		size=s;
		stack = new int[s];
		top=-1;
	}
	
	void push(int data) {
		if(top==size) {
			System.out.print("Stack overflowed");
		}else {
			top++;
			stack[top]=data;
		}
	}
	
	void pop() {
		if(top==-1) {
			System.out.print("Stack is empty");
		}else {
			top--;
		}
	}
	
	void print() {
		for(int i=0;i<=top;i++) {
			System.out.print(stack[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		StackA str= new StackA(5);
		str.push(5);
		str.push(8);
		str.push(7);

		str.print();
		System.out.println();
		str.pop();
		str.print();
	}

}
