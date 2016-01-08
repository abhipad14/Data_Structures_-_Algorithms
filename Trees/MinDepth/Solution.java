package Trees.MinDepth;

public class Solution {
	
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	
	public int minDepth(TreeNode a) {
		if(a==null){
			return 0;
		}
		else{
			if(a.left!=null && a.right!=null){
				int left = 1+minDepth(a.left);
				int right = 1+minDepth(a.right);
				return Math.min(left, right);
			}
			else{
				if(a.left==null){
					return 1+minDepth(a.right);
				}
				else{
					return 1+minDepth(a.left);
				}
			}
		}
	}
}
