package Trees.Cartesian;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	TreeNode root = null;
	public TreeNode buildTree(ArrayList<Integer> a) {
		
		root = create(a);
		return root;
    }
	
	
	public TreeNode create(ArrayList<Integer> a){
		if(a.size()>0){
			int len = a.size();
			HashMap<Integer, Integer> map = new HashMap<>();
			for(int i=0; i<len; i++){
				map.put(a.get(i), i);
			}
			ArrayList<Integer> main = new ArrayList<>();
			main.addAll(a);
			Collections.sort(a);
			int i= a.size()-1;
			TreeNode temp = new TreeNode(a.get(i));
			int index = map.get(a.get(i));
			ArrayList<Integer> right = new ArrayList<>();
			for(int j=index+1; j<main.size(); j++){
				right.add(main.get(j));
			}
			ArrayList<Integer> left = new ArrayList<>();
			for(int j=0; j<index; j++){
				left.add(main.get(j));
			}
			temp.right = create(right);
			temp.left = create(left);
			return temp;
		}
		else{
			return null;
		}
		
	
	}
}
