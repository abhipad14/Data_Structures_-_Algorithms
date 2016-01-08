package Trees.Invert;



public class Solution {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	
	public TreeNode invertTree(TreeNode root) {
		change(root);
		return root;
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
