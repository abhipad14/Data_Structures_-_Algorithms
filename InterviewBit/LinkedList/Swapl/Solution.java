package LinkedList.Swapl;

import java.util.LinkedList;

class ListNode {
	public int val;
	public ListNode next;
	ListNode(int x) { val = x; next = null; }
}


public class Solution {
	public ListNode swapPairs(ListNode a) {
		ListNode head = null;
		if(a.next==null){
			return a;
		}
		ListNode temp=null, temp2, prev= null;;
		while(a!=null  && a.next!=null ){
			if(head==null){
				temp = a.next.next;
				temp2 = a.next;
				a.next = temp;
				temp2.next = a;
				head = temp2;
				prev = a; 
			}
			else{
				
				temp = a.next.next;
				temp2 = a.next;
				prev.next = temp2;
				a.next = temp;
				temp2.next = a;
				prev = a;
			}
			a = temp;
		}
		return head;
	}
}
