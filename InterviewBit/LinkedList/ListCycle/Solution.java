package LinkedList.ListCycle;

import java.util.HashSet;

class ListNode {
	public int val;
	public ListNode next;
	ListNode(int x) { val = x; next = null; }
}



public class Solution {
	public ListNode detectCycle(ListNode a) {
		ListNode answer = null;
		HashSet<ListNode> list = new HashSet<>();
		while(true){
			if(list.isEmpty()){
				list.add(a);
			}
			else{
				if(list.contains(a)){
					answer = a;
					break;
				}
				else{
					list.add(a);
				}
			}
			a = a.next;
			if(a==null){
				break;
			}
			
		}
		return answer;
	}
	
	
	
	public ListNode detectCycle1(ListNode a) {
		ListNode answer = null;
		ListNode prev = null;
		ListNode curr = a;
		ListNode temp = a;
		while(curr!=null){
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return answer;
	}
}
