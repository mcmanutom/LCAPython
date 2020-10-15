
import java.util.ArrayList; 
import java.util.List; 
  
//Creating nodes for tree here
class Node 
{
    int value;
    Node left;
    Node right;
 
    Node(int value)
    {
        this.value = value;
        right = null;
        left = null;
    }

	//Creating tree with each node as had issues when comparing binarytree type to nodes
	public static Node createTree()
	{
 
		Node rootNode = new Node(8);		//	    8
		Node node5 = new Node(5);			//	   / \
		Node node10 = new Node(10);			//    5   10 	 
		Node node2 = new Node(2);			//   / \  / \
		Node node6 = new Node(6);			//  2   6 3  12
		Node node3 = new Node(3);
		Node node12 = new Node(12);
 
		rootNode.left = node5;
		rootNode.right = node10;
 
		node5.left = node2;
		node2.right = node6;
 
		node10.left = node3;
		node10.right = node12;

		return rootNode;
	}
	 
	 


}
