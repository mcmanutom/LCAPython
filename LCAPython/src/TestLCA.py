'''
Created on 22 Oct 2020

@author: user
'''
import unittest
import LCA
from LCA import findLCA 
   

class Test(unittest.TestCase):

  
    def testName(self):
        pass
     
    def testLca(self): 

        root = LCA.Node(1) 
        root.left = LCA.Node(2) 
        root.right = LCA.Node(3) 
        root.left.left = LCA.Node(4) 
        root.left.right = LCA.Node(5) 
        root.right.left = LCA.Node(6) 
        root.right.right = LCA.Node(7)
        self.assertEquals(2,findLCA(root,4,5))
        
    def test_EmptyTree(self):
        root = None
        self.assertEqual(-1, LCA.findLCA(root, 6, 7))
        
    def test_BothNodesNotPresent(self):
        root = LCA.Node(1)
        self.assertEqual(-1,LCA.findLCA(root, 6, 7))    
        
        
