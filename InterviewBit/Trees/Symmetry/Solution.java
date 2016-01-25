package Trees.Symmetry;

public class Solution {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public int isSymmetric(TreeNode a) {
		
		if(a==null) return 1;
		change(a.left);
		if(check(a.left, a.right)){
			return 1;
		}
		return 0;
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
	
	public void change(TreeNode a){
		if(a!=null){
			change(a.left);
			change(a.right);
			TreeNode temp = a.left;
			a.left = a.right;
			a.right = temp;
		}
	}
}
