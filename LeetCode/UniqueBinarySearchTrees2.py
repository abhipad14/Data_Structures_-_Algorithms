# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):
    ans = list()
    def generateTrees(self, n):
        """
        :type n: int
        :rtype: List[TreeNode]
        """


    def createTrees(self, index, currNode, numArr, root):
       if index < len(numArr):
           if currNode.val < numArr[index]:
               if currNode.right is None:
                   currNode.right = TreeNode.__init__(currNode[index])
                   index+=1
                   self.createTrees(index, root, numArr, root)
               else:
                   self.createTrees(index, currNode.right, numArr, root)
           else:
               if currNode.left is None:
                   currNode.left = TreeNode.__init__(currNode[index])
                   index += 1
                   self.createTrees(index, root, numArr, root)
               else:
                   self.createTrees(index, currNode.left, numArr, root)
       else:
           self.ans.append(root)

    def createNumArr(self, currList, value):
       for i in range(1, n+1):
           pass
