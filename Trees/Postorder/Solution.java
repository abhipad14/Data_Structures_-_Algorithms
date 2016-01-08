package Trees.Postorder;

import java.util.ArrayList;

public class Solution {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	ArrayList<Integer> answer;
	public ArrayList<Integer> postorderTraversal(TreeNode a) {
		answer = new ArrayList<>();
		post(a);
		return answer;
	}
	
	public void post(TreeNode a){
		if(a!=null){
			post(a.left);
			post(a.right);
			answer.add(a.val);
		}
	}
}
