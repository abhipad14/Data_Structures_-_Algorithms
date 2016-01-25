package Trees.InorderNext;

import Trees.InorderNext.Solution.TreeNode;

public class AlternateSolution {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public TreeNode getSuccessor(TreeNode a, int b) {
		TreeNode curr = find(b, a);
		if(curr==null) return null;
		if(curr.right!=null){
			return findMin(curr.right);
		}
		else{
			TreeNode succ = null;
			TreeNode ans = a;
			while(ans != curr) {
				if(curr.val < ans.val) {
					succ = ans; 
					ans = ans.left;
				}
				else
					ans = ans.right;
			}
			return succ;
		}
	}
	public TreeNode findMin(TreeNode root){
		if(root==null) return null;
		while(root.left!=null){
			root = root.left;
		}
		return root;
		
	}
	
	public TreeNode find(int val, TreeNode root){
		if(root==null){
			return null;
		}
		else if(root.val == val){
			return root;
		}
		else if(root.val>val){
			return find(val, root.left);
		}
		else{
			return find(val, root.right);
		}
	}
}
