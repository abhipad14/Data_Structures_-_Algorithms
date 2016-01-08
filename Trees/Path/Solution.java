package Trees.Path;

public class Solution {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public int hasPathSum(TreeNode a, int b) {
		int answer = 0;
		if(path(a, b)) return 1;
		return answer;
	}
	
	public boolean path(TreeNode a, int sum){
		if(a!=null){
			sum -= a.val;
			if(sum==0 && a.left==null  && a.right==null){
				return true;
			}
			else{
				return (path(a.left, sum) || path(a.right, sum));
			}
		}
		else{
			return false;
		}
	}
}
