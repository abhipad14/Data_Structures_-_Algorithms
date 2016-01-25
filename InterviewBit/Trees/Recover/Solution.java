package Trees.Recover;

import java.util.ArrayList;
import java.util.Collections;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}


public class Solution {
	
	ArrayList<Integer> answer, ans;
	public ArrayList<Integer> recoverTree(TreeNode a) {
		answer = new ArrayList<>();
	    ans = new ArrayList<>();
	    modifiedcheck(a);
		int prev = -1, mid = -1, future = -1;
		for(int i=0; i<ans.size(); i++){
			if(i>0){
				if(prev ==-1  &&  ans.get(i)<ans.get(i-1)){
					prev  = i-1;
					mid = i;
				}
				else if(ans.get(i)<ans.get(i-1)){
					future = i;
				}
			}
		}
		if(future==-1){
			answer.add(ans.get(prev));
			answer.add(ans.get(mid));
		}
		else if(prev!=-1){
			answer.add(ans.get(prev));
			answer.add(ans.get(future));
		}
		Collections.sort(answer);
		return answer;
	}
	
    public void modifiedcheck(TreeNode a){
		if(a!=null){
			modifiedcheck(a.left);
			ans.add(a.val);
			modifiedcheck(a.right);	
		}
	}
}
