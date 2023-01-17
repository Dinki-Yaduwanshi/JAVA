package tree;

public class Inorder {
 static int idx=-1;
	
	static class Node{
		int data;
		Node left;
		Node  right;
		
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	
	static Node buildTree(int[]arr ) {
		idx++;
		if(arr[idx]==-1) {
			return null;
		}else {
			Node newNode = new Node(arr[idx]);
			newNode.left=buildTree(arr);
			newNode.right=buildTree(arr);
			
			return newNode;
		}
		
	}
  
	static void inorder(Node root) {
		if(root==null) {
			return;
		}else {
			inorder(root.left);
			System.out.print(root.data);
			inorder(root.right);
		}
	}
	
	
	
	
public static void main(String args[]) {
	int[] arr= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
	Inorder tree= new Inorder();
	Node root=tree.buildTree(arr);
	inorder(root);	
}
}
