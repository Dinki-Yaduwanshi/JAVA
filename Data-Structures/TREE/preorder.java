package tree;

public class Preorder {
	 static int idx=-1;
	static class Node{            // creating a class node where individual data will get stored
		int data;                   // value of node
		Node left;                  // the left child node
		Node right;                 // the right child node
		
		Node(int data){             // a constructor for node assigning data and initializing its left and right node
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	static Node BuildTree(int[] nodes) {       // a ,method to byuild the tree according to the given array
		idx++;                                   // the pointer for the array 
	if(nodes[idx]==-1) {                       // if root is null
		return null;
	}
	 
	Node newNode= new Node(nodes[idx]);//by recursion build tree will get called again and again
	newNode.left=BuildTree(nodes);     // assigning the left node by recursion
	newNode.right=BuildTree(nodes);    // assigning the right node by recursion
	
	return newNode;
		
	}
	
 static void preorder(Node root){   // printing the tree in a preorder form=> root,left,right
   if(root==null){                  // if root is null, omit
   return;}
   
  System.out.print(root.data+" ");  //print the data of the root node 
  preoder(root.left);               // recursion
  preoder(root.right);}             // recursion
	
	public static void main(String[] args) {
		int [] nodes= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; // given preorder
		
		Preorder tree = new Preorder(); // creating an object of the class
		Node root = tree.BuildTree(nodes); // assigning and starting the tree with root node
		preorder(root);                    // printing preoder for the tree

	}

}
