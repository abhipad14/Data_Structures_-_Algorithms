package Trees.Inorder;

import java.util.ArrayList;

public class Solution {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	ArrayList<Integer> answer;
	public ArrayList<Integer> inorderTraversal(TreeNode a) {
		answer = new ArrayList<>();
		inorder(a);
		return answer;
	}
	
	public void inorder(TreeNode a){
		if(a!=null){
			inorder(a.left);
			answer.add(a.val);
			inorder(a.right);
		}
	}
}
