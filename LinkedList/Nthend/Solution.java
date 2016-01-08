package LinkedList.Nthend;



class ListNode {
	public int val;
	public ListNode next;
	ListNode(int x) { val = x; next = null; }
}



public class Solution {
	public ListNode removeNthFromEnd(ListNode a, int b) {
		ListNode head = a;
		int len = findLength(a);
		if(b>=len){
			head = a.next;
			a.next = null;
			return head;
		}
		for(int i=0; i<len-b-1; i++){
			a = a.next;
		}
		if(b==1){
			a.next = null;
		}
		else{
			a.next = a.next.next;
		}
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
