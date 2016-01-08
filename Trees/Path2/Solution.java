package Trees.Path2;

import java.util.ArrayList;


public class Solution {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	ArrayList<ArrayList<Integer>> answer;
	public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
		answer = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
		path(root, sum, list);
		return answer;
	}
	
	
	public void path(TreeNode a, int sum, ArrayList<Integer> list){
		if(a!=null){
			sum -= a.val;
			list.add(a.val);
			if(sum==0 && a.left==null  &&  a.right==null){
				answer.add(list);
			}
			else{
				ArrayList<Integer> temp = new ArrayList<>();
				temp.addAll(list);
				path(a.left, sum, temp);
				ArrayList<Integer> temp2 = new ArrayList<>();
				temp2.addAll(list);
				path(a.right, sum, temp2);
			}
		}
		
	}
}
