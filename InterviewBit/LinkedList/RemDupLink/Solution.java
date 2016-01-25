package LinkedList.RemDupLink;



class ListNode {
	public int val;
	public ListNode next;
	ListNode(int x) { val = x; next = null; }
}



public class Solution {
	public ListNode deleteDuplicates(ListNode a) {
		ListNode head = a;
		ListNode prev = a;
		a = a.next;
		int value = prev.val;
		while(a!=null){
			if(value == a.val){
				prev.next = a.next;
			}
			else{
				prev = a;
				value = a.val;
			}
			a = a.next;
		}
		return head;
	}
}
