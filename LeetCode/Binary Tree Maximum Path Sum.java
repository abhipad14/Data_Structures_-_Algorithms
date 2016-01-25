/*
Given a binary tree, find the maximum path sum.

For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path does not need to go through the root.

For example:
Given the below binary tree,

       1
      / \
     2   3
Return 6.
*/



* Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    int answer;
	public int maxPathSum(TreeNode a) {
		answer = Integer.MIN_VALUE;
		int temp = sum(a);
		return answer;
	}
	
	
	public int sum(TreeNode a){
		if(a==null) return 0;
		else{
			int left = sum(a.left);
			int right = sum(a.right);
			int maxlr = Math.max(a.val, Math.max(a.val+left, a.val+right));
			int maxsum = Math.max(a.val+left+right, maxlr);
			answer = Math.max(answer, maxsum);
			return maxlr;
		}
	}
}
