package Trees.MaxDepth;

public class Solution {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public int maxDepth(TreeNode a) {
		if(a==null){
			return 0;
		}
		else{
			int left = 1+maxDepth(a.left);
			int right = 1+maxDepth(a.right);
			return Math.max(left, right);
		}
	}
}
