package LinkedList.RevListSample;



class ListNode {
	public int val;
	public ListNode next;
	ListNode(int x) { val = x; next = null; }
}



public class Solution {
	public ListNode reverseList(ListNode a) {
		ListNode head  = null;
		ListNode pre  = a;
		ListNode curr = a;
		while(curr!=null){
			curr = pre.next;
			pre.next= head;
			head = pre;
			pre = curr;
		}
		return head;
	}
}
