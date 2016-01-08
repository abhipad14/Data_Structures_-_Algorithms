package Trees.Balanced;

import java.util.HashMap;

public class Solution {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public int isBalanced(TreeNode a) {
		int answer = 0;
		HashMap<TreeNode, Integer> map = new HashMap<>();
		creatMap(a, 0, map);
		if(check(a, map)){
			return 1;
		}
		return answer;
	}
	public boolean check(TreeNode a, HashMap<TreeNode, Integer> map){
		if(a==null){
			return true;
		}
		else{
			if(a.left!=null && a.right!=null){
				int diff = Math.abs(map.get(a.left)- map.get(a.right));
				if(diff<=1){
					return (check(a.left, map)  && check(a.right, map));
				}
				else{
					return false;
				}
			}
			else if(a.left==null && a.right!=null){
				if(map.get(a.right)==1){
					return true;
				}
				else{
					return false;
				}
			}
			else if(a.left!=null && a.right==null){
				if(map.get(a.left)==1){
					return true;
				}
				else{
					return false;
				}
			}
			else{
				return true;
			}
		}
	}
	
	
	public int creatMap(TreeNode a, int height, HashMap<TreeNode, Integer> map){
		if(a==null){
			return height-1;
		}
		else{
			int val = Math.max(creatMap(a.left, height+1, map), creatMap(a.right, height+1, map));
			map.put(a, val-height);
			return val;
		}
		
	}
	

}
