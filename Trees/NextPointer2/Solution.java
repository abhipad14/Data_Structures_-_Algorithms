package Trees.NextPointer2;

import java.util.Stack;

import javax.swing.tree.TreeNode;

public class Solution {
	public class TreeLinkNode {
		int val;
		TreeLinkNode left, right, next;
		TreeLinkNode(int x) { val = x; }
	}
	
	Stack<TreeLinkNode> s1, s2;
	public void connect(TreeLinkNode root) {
        s1 = new Stack<>();
        s2 = new Stack<>();
		if(root!=null){
			s2.push(root);
			while(!s1.isEmpty() || !s2.isEmpty()){
				while(!s2.isEmpty()){
	        		TreeLinkNode temp2 = s2.pop();
	        		if(!s2.isEmpty()){
	        			temp2.next = s2.peek();
	        		}
	        		else{
	        			temp2.next=null;
	        		}
	        		s1.push(temp2);
	        	}
	        	while(!s1.isEmpty()){
	        		TreeLinkNode temp = s1.pop();
	        		if(temp.right!=null){
	        			s2.push(temp.right);
	        		}
	        		if(temp.left!=null){
	        			s2.push(temp.left);
	        		}
	        	}
			}
        }
    }
}
