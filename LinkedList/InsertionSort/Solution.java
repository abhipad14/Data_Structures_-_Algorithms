package LinkedList.InsertionSort;

class ListNode {
	public int val;
	public ListNode next;
	ListNode(int x) { val = x; next = null; }
}



public class Solution {
	public ListNode insertionSortList(ListNode a) {
		ListNode head = null;
		while(a!=null){
			ListNode temp = head;
			ListNode prev= null;
			if(temp!=null){
			    while(temp!=null && temp.val < a.val){
			    	prev = temp;
				    temp = temp.next;
    			}
			    if(temp==head){
			    	head = new ListNode(a.val);
			    	head.next = temp;
			    }
			    else{
			    	prev.next = new ListNode(a.val);
	    			prev.next.next = temp;
			    }
    			
			}
			else{
			    temp = new ListNode(a.val);
			    head = temp;
			    prev = temp;
			}
			
			a= a.next;
		}
		return head;
	}
}
