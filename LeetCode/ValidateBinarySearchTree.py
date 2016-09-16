# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):
    inorder = list()
    def isValidBST(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        self.getInorder(root)
        i = 1
        while i < len(self.inorder):
            if self.inorder[i] < self.inorder[i-1]:
                return False
            i += 1
        return True

    def getInorder(self, currNode):
        if currNode is not None:
            self.getInorder(currNode.left)
            self.inorder.append(currNode.val)
            self.getInorder(currNode.right)

if __name__ == '__main__':
    root = TreeNode(0)
    obj = Solution()
    print(obj.isValidBST(root))
