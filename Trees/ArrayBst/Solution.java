package Trees.ArrayBst;

import java.util.ArrayList;

public class Solution {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	TreeNode root;
	public TreeNode sortedArrayToBST(ArrayList<Integer> a) {
		root = null;
		create(0, a.size()-1, a.size(), a);
		return root;
	}
	
	
	public TreeNode create(int left, int right, int len, ArrayList<Integer> a){
		if(left<=right){
			int mid  = (left+right)/2;
			if(left==0 && right ==len-1){
				root = new TreeNode(a.get(mid));
				root.left= create(left, mid-1, len, a);
				root.right = create(mid+1, right, len, a);
				return root;
			}
			else{
				TreeNode temp = new TreeNode(a.get(mid));
				temp.left = create(left, mid-1, len, a);
				temp.right = create(mid+1, right, len, a);
				return temp;
			}
		}
		else{
			return null;
		}
	}
}
