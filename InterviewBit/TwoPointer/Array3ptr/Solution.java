package TwoPointer.Array3ptr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
public int minimize(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
	    
	    ArrayList<Node> list = new ArrayList<>();
	    
	    add(list, A, 0);
	    add(list, B, 1);
	    add(list, C, 2);
	    
	    Collections.sort(list);
	    
	    int res = Integer.MAX_VALUE;
	    int n = list.size();
	    HashMap<Integer, Integer> hashMap = new HashMap<>();
	    
	    for (int i = 0; i < n; i++) {
	        
	        Node node = list.get(i);
            hashMap.put(node.index, node.value);
	        
	        if (hashMap.size() == 3) {
	            int a = hashMap.get(0);
	            int b = hashMap.get(1);
	            int c = hashMap.get(2);
	            
	            
	            int temp = Math.max(Math.abs(a - b), Math.abs(b - c));
	            temp = Math.max(temp, Math.abs(c - a));
	            
	            res = Math.min(temp, res);
	        }
	        
	    }
	    
	    return res;
	    
	}
	
	public void add(ArrayList<Node> list, ArrayList<Integer> A, int idx) {
	    for (int num : A)
	        list.add(new Node(num, idx));
	}
	
	
	class Node implements Comparable<Node>{
	    int value;
	    int index;
	    
	    public Node(int value, int idx) {
	        this.value = value;
	        this.index = idx;
	    }
	    
	    @Override
	    public int compareTo(Node node) {
	        return Integer.compare(value, node.value);
	    }
	}
}
