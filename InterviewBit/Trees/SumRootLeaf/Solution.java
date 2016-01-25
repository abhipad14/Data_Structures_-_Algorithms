package Trees.SumRootLeaf;

import java.util.ArrayList;

public class Solution {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
    
	public int sumNumbers(TreeNode a) {
	    return getsum(a, 0) % 1003; 
	}
	
	public int getsum(TreeNode a, int num) {
	    
	    if (a == null){
	        return 0;
	    }  
	    if (a.left == null && a.right == null) {
	        int curr = num * 10 + a.val;
	        return curr % 1003;
	    }
	    num = (num*10 + a.val)%1003;
	    return (getsum(a.left, num) + getsum(a.right, num)) % 1003;
	}
}
