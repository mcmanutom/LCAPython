
import java.util.ArrayList; 
import java.util.List; 
  
//Creating nodes for tree here
class Node {
    int value;
    Node left;
    Node right;
 
    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
} 