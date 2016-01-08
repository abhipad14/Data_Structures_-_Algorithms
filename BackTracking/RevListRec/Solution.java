package BackTracking.RevListRec;


class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}


public class Solution {
	ListNode head = null;
	public ListNode reverseList(ListNode a) {
		reverse(a);
		a.next = null;
		return head;
		
	}
	
	public ListNode reverse(ListNode a){
		if(a.next!=null){
			reverse(a.next).next = a;
			return a;
		}
		else{
			head = a;
			return a;
		}
	}
	
	
	
}
