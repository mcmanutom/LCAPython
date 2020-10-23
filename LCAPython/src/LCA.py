'''
Created on 15 Oct 2020
 
@author: user
''' 
  
# A binary tree node 
class Node: 
    def __init__(self, key): 
        self.key =  key 
        self.left = None
        self.right = None
  
def findPath( root, path, k): 
  
    if root is None: 
        return False
  
    # Store this node is path vector. The node will be 
    # removed if not in path from root to k 
    path.append(root.key) 
  
    # See if the k is same as root's key 
    if root.key == k : 
        return True
  
    # Check if k is found in left or right sub-tree 
    if ((root.left != None and findPath(root.left, path, k)) or
            (root.right!= None and findPath(root.right, path, k))): 
        return True 
       
    path.pop() 
    return False
  
# Returns LCA if node n1 , n2 are present in the given 
# binary tre otherwise return -1 
def findLCA(root, n1, n2): 

    path1 = [] 
    path2 = [] 
  
    if (not findPath(root, path1, n1) or not findPath(root, path2, n2)): 
        return -1 

    i = 0 
    while(i < len(path1) and i < len(path2)): 
        if path1[i] != path2[i]: 
            break
        i += 1
    return path1[i-1] 
  
  
root = Node(1) 
root.left = Node(2) 
root.right = Node(3) 
root.left.left = Node(4) 
root.left.right = Node(5) 
root.right.left = Node(6) 
root.right.right = Node(7) 
  
# This code is from by https://www.geeksforgeeks.org/lowest-common-ancestor-binary-tree-set-1/ as i could not figure out python and have not used it before