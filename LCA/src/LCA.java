
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
} 

//This function will create the entire tree 
class binaryTree
{
	Node root;

//This function will add nodes to the tree
	Node addToTree (Node x, int value)
	{
		if (value == 0) //Finds where new node is placed
		{
			return new Node(value);
		}
		if (value < x.value) //If less than node at position x goes to left hand branch
		{
	        x.left = addToTree(x.left, value); //Recursively goes until reaches end of branch
	    } 
		else if (value > x.value) //If greater than node at position x goes down right hand branch
		{
	        x.right = addToTree(x.right, value);  
		} 
		else
		{
			Node result = x;
			return (result); // When no more options that it is less than or equal to it returns value
		}
		return(x);
	}
	
	public void add(int value)  // Implementing the add to tree
	{
	    root = addToTree(root, value);
	}
	
	 public binaryTree createTree() //Creating a tree to test LCA
	 {
		 binaryTree LCASample = new binaryTree();
		 LCASample.add(8);				//			    8
		 LCASample.add(5);				//			  /	  \
		 LCASample.add(10);				//			 5		10
		 LCASample.add(2);				//			/ \    /  \
		 LCASample.add(6);				//		   2   6  9    12
		 LCASample.add(9);
		 LCASample.add(12);
		 
		 return(LCASample);
	 }
	 
	 public Node LCA(binaryTree tree, int x, int y) //takes in tree and values of the two nodes we want to find LCA for
	 {
		 Node test = tree.root;
		 parseInt(test);
		 while (root != null) 
		    { 
		        if (root >  x && root > y) // If both x and y are smaller than root then LCA lies in left branch
		        {
		        	root = root.left; 
		        }
		        
		        if (root < x && root < y) // If both x and y are bigger than root then LCA lies in right branch
	        	{
		        	root = root.right;   
	        	}
		        else break;
		        return (root);
 
	 }
}
}