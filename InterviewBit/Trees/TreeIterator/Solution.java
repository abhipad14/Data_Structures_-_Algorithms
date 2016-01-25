package Trees.TreeIterator;

import java.util.Stack;

public class Solution {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	Stack<TreeNode> stack;
	public Solution(TreeNode root) {
        stack = new Stack<>();
        fillStack(root);
    }

    
    public boolean hasNext() {
    	if(stack.isEmpty()) return false;
    	else return true;
    }

    
    public int next() {
        int val = stack.peek().val;
        TreeNode temp = stack.pop();
        fillStack(temp.right);
        return val;
    }
    
    
    public void fillStack(TreeNode a){
    	while(a!=null){
    		stack.push(a);
    		a = a.left;
    	}
    }
}
