package Trees.Balanced;

import java.util.HashMap;

import Trees.Balanced.Solution.TreeNode;

public class ShortSolution {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	int answer = 1;
	public int isBalanced(TreeNode a) {
		height(a);
		return answer;
	}
	
	public int height(TreeNode a){
		if(a==null){
			return 0;
		}
		else{
			int left = height(a.left)+1;
			int right = height(a.right)+1;
			int diff = Math.abs(left-right);
			if(diff>1){
				answer = 0;
			}
			return Math.max(left, right);
		}
	}
}
