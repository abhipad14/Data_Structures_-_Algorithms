package LinkedList.AddNum;




class ListNode {
	public int val;
	public ListNode next;
	ListNode(int x) { val = x; next = null; }
}




public class Solution {
	public ListNode addTwoNumbers(ListNode a, ListNode b) {
		ListNode head = a;
		ListNode head1 = a;
		ListNode head2 = b;
		ListNode temp = null;
		int carry = 0;
		int count =0;
		while(head1!=null && head2!=null){
			int one = head1.val;
			int two = head2.val;
			int sum = one+two+carry;
			carry = sum/10;
			if(count==0){
				head = new ListNode(sum%10);
				temp = head;
				count++;
			}
			else{
				temp.next = new ListNode(sum%10);
				temp = temp.next;
			}
			head1 = head1.next;
			head2 = head2.next;
		}
		while(head1!=null){
			int sum = head1.val + carry;
			carry = sum/10;
			temp.next = new ListNode(sum%10);
			temp = temp.next;
			head1 = head1.next;
		}
		while(head2!=null){
			int sum = head2.val + carry;
			carry = sum/10;
			temp.next = new ListNode(sum%10);
			temp = temp.next;
			head2 = head2.next;
		}
		if(carry!=0){
		    temp.next = new ListNode(carry);
		}
		return head;
	}
	
	
	
	
}
