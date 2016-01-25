package Trees.BinTree1;

import java.util.ArrayList;

public class Solution {
	
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	public TreeNode buildTree(ArrayList<Integer> inorder, ArrayList<Integer> postorder) {
	    if (inorder == null || postorder == null || inorder.size() == 0 || inorder.size() != postorder.size())
	        return null;
	    TreeNode root;
	    int n = inorder.size();
	    root = rec(inorder, postorder, 0, n - 1, n - 1);
	    return root;
	}
	
	
	public TreeNode rec(ArrayList<Integer> inorder, ArrayList<Integer> postorder, int start, int end, int postIndex) {
	    if (start > end)
	        return null;
	    TreeNode node;
	    int nodeVal = postorder.get(postIndex);
	    node = new TreeNode(nodeVal);
	    int i;
	    for (i = start; i <= end; i++) {
	        if (inorder.get(i) == nodeVal)
	            break;
	    }
	    node.left = rec(inorder, postorder, start, i - 1, postIndex - (end - i + 1));
	    node.right = rec(inorder, postorder, i + 1, end, postIndex - 1);
	    return node;
	}
	
}
