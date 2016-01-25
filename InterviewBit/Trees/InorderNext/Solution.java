package Trees.InorderNext;

public class Solution {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	TreeNode answer = null;
	public TreeNode getSuccessor(TreeNode a, int b) {
		if(a==null){
			return answer;
		}
		else if(a.val>b){
			answer = a;
			return getSuccessor(a.left, b);
		}
		else{
			return getSuccessor(a.right, b);
		}
	}
}
