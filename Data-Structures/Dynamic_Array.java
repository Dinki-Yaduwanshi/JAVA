public abstract class Array<T> implements Iterable <T>{
	private T[]arr;//static array
	private int len=0;// length user thinks array is(free slots)
	private int capacity=0;// actual array size
	
	public Array() {this(16);}//constructor1
	public Array (int capacity){
		if(capacity<0)throw new IllegalArgumentException("Illegal Capacity:"+capacity);	
		this.capacity=capacity;
		arr=(T[])new Object[capacity];//initialize our array and cast it to type T
		
	}

	public int size() {
		return len;
	}
	public boolean isEmpty() {
		return size()==0;
	}
	
public T get(int index) {
	return arr[index];
}
	
public T set(int index,T elem) {
	arr[index]=elem;
	return elem;
}

public void clear() {
	  for(int i=0;i<capacity;i--) {
		  arr[i]=null;}
		  len=0;
	  }


public void add(T elem) {
	//resizing
	if(len+1>=capacity) {
		if(capacity==0)capacity=1;
		else capacity*=2;//double the size 
		T[] new_arr=(T[]) new Object [capacity];//create new array with new capacity
		for(int i=0;i<len;i++) {
			new_arr[i]=arr[i];//copy all elements 
			arr=new_arr;//now array has null padded , set old array to new array
		}
		arr[len++]=elem;
	}
}
//removes element at a particular index
public T removeAt(int rm_index) {
	if(rm_index>=len&&rm_index<0) throw new IndexOutOfBoundsException();//check if null
	T data=arr[rm_index];//grab data at the specified index
	T[] new_arr=(T[]) new Object[len-1];//Initialize new array with size length reduced by 1
	//copy the elements to new array except the index
	for(int i=0,j=0;i<len;i++,j++)
	{
		if(i==rm_index)j--;//skips over rm_idex by fixing j temporarily,let j lag behind in the new array
		else new_arr[j]=arr[i];
		arr=new_arr;
		capacity=--len;
		return data;}
	return data;
		
	}
	
	public boolean remove(Object obj) {
		for(int i=0;i<len;i++) {
			if(arr[i].equals(obj)) {
				removeAt(i);
				return true;
			}
		} 
		return false;
	}
	
	
	public int indexOf(Object obj) {
		int a=0;
		for(int i=0;i<len;i++) {
			if(arr[i].equals(obj)) {
				a=i;}
			a= -1;
		}
		return a;
	}
	
	public boolean contains(Object obj) {
		return indexOf(obj)!=-1;
		
	}
	
	//Iteraror is fast but not as fast as iterative for loop
	@Override public java.util.Iterator<T> iterator(){
		return new java.util.Iterator<T>() {
			int index=0;
			public boolean hasNext() {
				return index<len;
				
			}
			public T next() {
				return arr[index++];
			}
		};
	}
	
	@Override public String toString() {
		if(len==0)return "[]";
		else {
			StringBuilder sb=new StringBuilder(len).append("[");
			for(int i=0;i<len-1;i++) {
				sb.append(arr[i]+",");
				return sb.append(arr[len-1]+"]").toString();
				
				
			}
		}
		return null;
	}
	
}



