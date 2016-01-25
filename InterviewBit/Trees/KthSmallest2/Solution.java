package Trees.KthSmallest2;

public class Solution {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	int count, answer;
	public int kthsmallest(TreeNode root, int k) {
		answer = 0;
		count =0;
		inorder(root, k);
		return answer;
    }
	
	
	public void inorder(TreeNode a, int k){
		if(a!=null){
			inorder(a.left, k);
			count++;
			if(count==k ){
				answer = a.val;
				return;
			}
			inorder(a.right, k);
		}
	}
}
