package StacksNQueues.SlidingMax;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public ArrayList<Integer> slidingMaximum(ArrayList<Integer> A, int B) {
	    int n = A.size();
	    int i;
	    ArrayList<Integer> res = new ArrayList<>();
	    int window = Math.min(A.size(), B);
	    Deque<Node> deque = new LinkedList<>();
	    int val;
        Node ans;
	    
	    for (i = 0; i < window - 1; i++) {
	        val = A.get(i);
	        
	        while (!deque.isEmpty() && deque.peekFirst().val <= val) {
	            deque.pollFirst();
	        }
	        
	        deque.addFirst(new Node(i, val));
	    }
	    
	    for (; i < n; i++) {
	        val = A.get(i);
	        
	        while (!deque.isEmpty() && (i - deque.peekLast().index >= window)) {
	            deque.pollLast();
	        }
	        
	        while (!deque.isEmpty() && deque.peekFirst().val <= val) {
	            deque.pollFirst();
	        }
	        
	        deque.addFirst(new Node(i, val));
	        
	        ans = deque.peekLast();
	        
	        res.add(ans.val);
	    }
	    
	    return res;
	}
	
	class Node {
	    int val;
	    int index;
	    
	    public Node(int index, int val) {
	        this.index = index;
	        this.val = val;
	    }
	}
}
