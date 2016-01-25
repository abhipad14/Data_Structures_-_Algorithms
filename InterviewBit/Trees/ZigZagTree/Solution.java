package Trees.ZigZagTree;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	ArrayList<ArrayList<Integer>> answer;
	public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode a) {
		answer = new ArrayList<>();
		if(a==null){
			return answer;
		}
		Stack<TreeNode> s1 = new Stack<>();
		Stack<TreeNode> s2 = new Stack<>();
		s1.push(a);
		while(!s1.isEmpty()   ||  !s2.isEmpty()){
			ArrayList<Integer> list1 = new ArrayList<>();
			ArrayList<Integer> list2 = new ArrayList<>();
			while(!s1.isEmpty()){
				
				TreeNode temp = s1.pop();
				if(temp.left!=null){
					s2.push(temp.left);
				}
				if(temp.right!=null){
					s2.push(temp.right);
				}
				list1.add(temp.val);
			}
			if(list1.size()>0){
			    answer.add(list1);
			}
		
			while(!s2.isEmpty()){
				
				TreeNode dum = s2.pop();
				if(dum.right!=null){
					s1.push(dum.right);
				}
				if(dum.left!=null){
					s1.push(dum.left);
				}
				list2.add(dum.val);
			}
			if(list2.size()>0){
			   answer.add(list2); 
			}
			
		}
		return answer;
	}
}
