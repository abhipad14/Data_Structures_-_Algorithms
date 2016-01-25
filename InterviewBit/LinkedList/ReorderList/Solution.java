package LinkedList.ReorderList;



class ListNode {
	public int val;
	public ListNode next;
	ListNode(int x) { val = x; next = null; }
}


public class Solution {
	public ListNode reorderList(ListNode a) {
		ListNode head = a;
		int len = findLength(head);
		if(len<=2){
			return a;
		}
		else{
			head = a;
			int mid = len/2;
			if(len%2==1){
				mid++;
			}
			int count = 0;
			ListNode temp = a;
			while(temp!=null){
				temp = temp.next;
				count++;
				if(count==mid){
					break;
				}
			}
			
			ListNode head2 = reverseList(temp);
			
			count = 0;
			if(len%2==1){
				mid--;
			}
			ListNode temp1 = a;
			ListNode temp2 = head2;
			ListNode help1, help2;
			while(count<mid){
				help1 = temp1.next;
				help2 = temp2.next;
				temp1.next = temp2;
				temp2.next = help1;
				temp1 = help1;
				temp2 = help2;
				count++;
			}
			temp1.next = null;
		}
		return head;
	}
	
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
	
	public static int findLength(ListNode head){
		int count= 0;
		while(head!=null){
			count++;
			head = head.next;
		}
		return count;
	}
}
