package Hashing.CopyList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Solution {
	class RandomListNode {
		int label;
		RandomListNode next, random;
		RandomListNode(int x) { this.label = x; }
	}
	
	
	public RandomListNode copyRandomList(RandomListNode head) {
		RandomListNode answer = null, temp = head, prev = head;
		HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
		if(temp!=null){
			answer = new RandomListNode(temp.label);
			map.put(temp, answer);
			mapping(map, answer, temp);
			prev = answer;
			temp = temp.next;
		}
		while(temp!=null){
			if(map.containsKey(temp)){
				RandomListNode dummy = map.get(temp);
				mapping(map, dummy, temp);
				prev.next = dummy;
				prev = dummy;
			}
			else{
				RandomListNode dummy = new RandomListNode(temp.label);
				map.put(temp, dummy);
				mapping(map, dummy, temp);
				prev.next = dummy;
				prev = dummy;
			}
			temp = temp.next;
		}
		return answer;
    }
	
	
	public void mapping(HashMap<RandomListNode, RandomListNode> map, RandomListNode ans, RandomListNode temp){
		if(map.containsKey(temp.random)){
			ans.random = map.get(temp.random);
		}
		else{
			if(temp.random!=null){
				RandomListNode dum = new RandomListNode(temp.random.label);
				ans.random = dum;
				map.put(temp.random, dum);
			}
		}
	}
}
