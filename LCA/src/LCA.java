
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

//This function will create the entire tree - unfinished so far
class binaryTree
{

//This function will add nodes to the tree - not completely done
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
			Node result = new Node (value);
			return (result); // When no more options that it is less than or equal to it returns value
		}
	}
}
