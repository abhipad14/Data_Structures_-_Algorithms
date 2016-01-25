package Trees.SameTree;

public class Solution {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	
	public int isSameTree(TreeNode a, TreeNode b) {
		int answer = 0;
		if(check(a, b)) return 1;
		return answer;
	}
	
	public boolean check(TreeNode a, TreeNode b){
		if((a==null && b!=null)  || (a!=null  && b==null)){
			return false;
		}
		else if(a==null && b==null){
			return true;
		}
		else{
			if(a.val==b.val){
				return (check(a.left, b.left)  && check(a.right, b.right));
			}
			else{
				return false;
			}
		}
	}
}
