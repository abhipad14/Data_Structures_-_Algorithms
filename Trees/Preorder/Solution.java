package Trees.Preorder;

import java.util.ArrayList;


public class Solution {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	ArrayList<Integer> answer;
	public ArrayList<Integer> preorderTraversal(TreeNode a) {
		answer = new ArrayList<>();
		pre(a);
		return answer;
	}
	
	public void pre(TreeNode a){
		if(a!=null){
			answer.add(a.val);
			pre(a.left);
			pre(a.right);
		}
	}
}
