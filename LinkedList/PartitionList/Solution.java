package LinkedList.PartitionList;



class ListNode {
	public int val;
	public ListNode next;
	ListNode(int x) { val = x; next = null; }
}


public class Solution {
	public ListNode partition(ListNode a, int b) {
		ListNode head = a;
		ListNode head1=null, head3=null, temp1=null, temp3=null;
		while(a!=null){
			if(a.val<b){
				if(head1==null){
					head1 = new ListNode(a.val);
					temp1 = head1;
				}
				else{
					temp1.next = new ListNode(a.val);
					temp1 = temp1.next;
				}
				
			}
			else if(a.val>=b){
				if(head3==null){
					head3 = new ListNode(a.val);
					temp3 = head3;
				}
				else{
					temp3.next = new ListNode(a.val);
					temp3 = temp3.next;
				}
			}
			a = a.next;
		}
		if(head1!=null){
		    head  = head1;
		    if(head3!=null){
		    	temp1.next = head3;
		    }    
		}
		else{
		    head = head3;
		}
		return head;
	}
}
