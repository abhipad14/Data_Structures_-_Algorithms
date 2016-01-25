package Trees.Symmetry;

public class ShortSolution {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	
	public int isSymmetric(TreeNode a) {
		int answer = 0;
		if(check(a.left, a.right)) return 1;
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
				return (check(a.left, b.right)  && check(a.right, b.left));
			}
			else{
				return false;
			}
		}
	}
}
