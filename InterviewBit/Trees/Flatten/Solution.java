package Trees.Flatten;

import java.util.ArrayList;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}


public class Solution {
	ArrayList<TreeNode> list;
	public TreeNode flatten(TreeNode a) {
		if(a==null) return null;
		list = new ArrayList<>();
		link(a);
		for(int i=0; i<list.size()-1; i++){
			list.get(i).left = null;
			list.get(i).right = list.get(i+1);
		}
		list.get(list.size()-1).left= null;
		list.get(list.size()-1).right= null;
		return list.get(0);
	}
	
	public void link(TreeNode a){
		if(a!=null){
			list.add(a);
			link(a.left);
			link(a.right);
		}
	}
}
