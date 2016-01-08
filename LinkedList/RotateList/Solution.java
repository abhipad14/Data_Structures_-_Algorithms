package LinkedList.RotateList;

import java.awt.List;

class ListNode {
	public int val;
	public ListNode next;
	ListNode(int x) { val = x; next = null; }
}



public class Solution {
	public ListNode rotateRight(ListNode a, int b) {
		ListNode head = a;
		ListNode start = a;
		int len = findLength(a);
		if(b>len){
			b = b%len;
		}
		if(b==0 || b==len){
			return a;
		}
		
		int counter=0;
		while(counter<len-b-1){
			a = a.next;
			counter++;
		}
		ListNode temp = a.next;
		a.next = null;
		head = temp;
		while(temp.next!=null){
			temp = temp.next;
		}
		temp.next = start;
		return head;
	}
	
	
	
	
	public static int findLength(ListNode head){
		int count= 0;
		while(head!=null){
			count++;
			head = head.next;
		}
		return count;
	}
}
