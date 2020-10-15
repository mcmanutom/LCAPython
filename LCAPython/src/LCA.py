'''
Created on 15 Oct 2020

@author: user
'''
 
public class LCA <Key extends Comparable<Key>, Value>
{
        //Creating nodes for tree here
        public static class Node 
        {
            int value;
            Node left;
            Node right;
         
            Node(int value)
            {
                this.value = value;
            }
        
            //Creating tree with each node as had issues when comparing binarytree type to nodes
            public Node createTree()
            {
         
                Node rootNode = new Node(8);        //        8
                Node node5 = new Node(5);            //       / \
                Node node10 = new Node(10);            //    5   10      
                Node node2 = new Node(2);            //   / \  / \
                Node node6 = new Node(6);            //  2   6 3  12
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
        
            public static Node LCA(Node root, Node a, Node b) {
                
                if(root == null)
                {
                    return null;
                }
                
                if(root.value == a.value || root.value == b.value )
                {
                    return root;
                }
                
                Node left = LCA(root.left,a,b); //checks if lca is next node on left
                Node right=LCA(root.right,a,b); //checks if lca is next node on right
                
                if(left!=null && right!=null)
                {
                    return root;
                }
                
                if(left== null)
                {
                    return right;
                }
                else
                {
                    return left;
                }
            }
         
         public void main(String[] args) {
                // TODO Auto-generated method stub
                 Node rootNode = createTree();
                Node node3 = new Node(3);
                Node node10 = new Node(10);
                System.out.println("Lowest common ancestor for node 3 and 10:" + LCA(rootNode,node3,node10).value);
             }
        }

        public LCA createTree() {
            // TODO Auto-generated method stub
            return null;
        }

}
