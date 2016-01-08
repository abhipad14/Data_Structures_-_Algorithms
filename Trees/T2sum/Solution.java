package Trees.T2sum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class Solution {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	int answer = 0;
	Stack<TreeNode> s1, s2;
	public int t2Sum(TreeNode A, int B) {
		s1 = new Stack<>();
		s2 = new Stack<>();
		fillstack(A, s1, true);
		fillstack(A.right, s2, false);
		check(B);
		return answer;
    }
	
	public void check(int b){
		if(s1.isEmpty()  || s2.isEmpty()){
			if(s1.isEmpty()){
				insideStack(s2, b);
			}
			else if(s2.isEmpty()){
				insideStack(s1, b);
			}
			return;
		}
		TreeNode left = s1.peek();
		TreeNode right = s2.peek();
		int sum = left.val +right.val;
		if(sum==b){
			answer = 1;
			return;
		}
		else if(sum<b){
			if(s1.size()>1){
				fillstack(s1.pop().right, s1, true);
			}
			else{
				s1.pop();
			}
			check(b);
		}
		else{
			fillstack(s2.pop().left, s2, false);
			check(b);
		}
	}
	
	public void fillstack(TreeNode a, Stack<TreeNode> s, boolean left){
		if(left){
			while(a!=null){
				s.push(a);
				a = a.left;
			}
		}
		else{
			while(a!=null){
				s.push(a);
				a = a.right;
			}
		}
	}
	
	public void insideStack(Stack<TreeNode> s, int b){
		ArrayList<Integer> temp = new ArrayList<>();
		int start = 0, end = 0;
		while(!s.isEmpty()){
			TreeNode dum = s.pop();
			if(s==s1){
				if(!s1.isEmpty()){
					fillstack(dum.right, s, true);
				}
				
			}
			else{
				fillstack(dum.left, s, false);
			}
			temp.add(dum.val);
		}
		start = 0;
		end = temp.size()-1;
		Collections.sort(temp);
		while(start<end){
			int sum = temp.get(start)+temp.get(end);
			if(sum==b){
				answer = 1;
				return;
			}
			else if(sum<b){
				start++;
			}
			else{
				end--;
			}
		}
	}
}
