package tree;

public class BinaryTreeS {
	 static int idx=-1;
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	static Node BuildTree(int[] nodes) {
		idx++;
	if(nodes[idx]==-1) {
		return null;
	}
	 
	Node newNode= new Node(nodes[idx]);//by recursion build tree will get called again and again
	newNode.left=BuildTree(nodes);
	newNode.right=BuildTree(nodes);
	
	return newNode;
		
	}
	
	
	public static void main(String[] args) {
		int [] nodes= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
		BinaryTreeS tree = new BinaryTreeS();
		Node root = tree.BuildTree(nodes);
		System.out.print(root.data);

	}

}
