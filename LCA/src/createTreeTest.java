import static org.junit.Assert.*;

import org.junit.Test;
 
public class createTreeTest {

	@Test
	public void testTreeNotNull() {
		BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(1); 					//         1
        tree.root.left = new Node(5); 				//		/    \
        tree.root.right = new Node(8); 				// 	   5	  8
        tree.root.left.left = new Node(2); 			//	  / \    / \
        tree.root.left.right = new Node(10); 		//    2  10  6  12
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(12);
        assertNotNull(tree.root);	
	}
	
	@Test
	public void testLCA() {
		BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(1); 					//         1
        tree.root.left = new Node(5); 				//		/    \
        tree.root.right = new Node(8); 				// 	   5	  8
        tree.root.left.left = new Node(2); 			//	  / \    / \
        tree.root.left.right = new Node(10); 		//    2  10  6  12
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(12);
        int test = 5;
        assertEquals(tree.findLCA(2,10).value, test);	
	}
	
     
}
