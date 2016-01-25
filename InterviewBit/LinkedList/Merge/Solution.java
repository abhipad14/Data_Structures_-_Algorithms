package LinkedList.Merge;



class ListNode {
	public int val;
	public ListNode next;
	ListNode(int x) { val = x; next = null; }
}



public class Solution {
	public ListNode mergeTwoLists(ListNode a, ListNode b) {
		ListNode head = null;
		ListNode temp = head;
		int count =0;
		while(a!=null  && b!=null){
			if(a.val==b.val){
				if(count==0){
					head = new ListNode(a.val);
					head.next = new ListNode(b.val);
					temp = head.next;
					a = a.next;
					b = b.next;
					count++;
				}
				else{
					temp.next = new ListNode(a.val);
					temp = temp.next;
					temp.next = new ListNode(b.val);
					temp = temp.next;
					a = a.next;
					b = b.next;
				}
			}
			else if(a.val<b.val){
				if(count==0){
					head = new ListNode(a.val);
					count++;
					temp = head;
				}
				else{
					temp.next = new ListNode(a.val);
					temp = temp.next;
				}
				a = a.next;
				
			}
			else{
				if(count==0){
					head = new ListNode(b.val);
					count++;
					temp = head;
				}
				else{
					temp.next = new ListNode(b.val);
					temp = temp.next;
				}
				b = b.next;
			}
		}
		if(a==null){
			temp.next = b;
		}
		else if(b==null){
			temp.next = a;
		}
		return head;
		
	}
}
