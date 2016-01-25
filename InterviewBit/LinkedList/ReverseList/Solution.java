package LinkedList.ReverseList;



class ListNode {
	public int val;
	public ListNode next;
	ListNode(int x) { val = x; next = null; }
}



public class Solution {
	public ListNode reverseBetween(ListNode a, int m, int n) {
		ListNode head = a;
		 ListNode temp = a;
		 ListNode start = a;
		 ListNode end = a;
		 int len = findLength(head);
		 if(len == 1){
			 return a;
		 }
		 if(m==n){
			 return a;
		 }
		 int counter = 0;
		 while(temp!=null && m>1){
		    start = temp;
		    temp = temp.next;
		    counter++;
		    if(counter-m==-1){
		    	break;
		    }
		 }
		 counter = 0;
		 ListNode prev =null;
		 ListNode curr = null;
		 while(temp!=null){
		   	if(counter==0){
		   		curr = temp.next;
		   		temp.next = prev;
		   		prev = temp;
		   		temp = curr;
		   		counter++;
		   		end = curr;
		   	}
		   	else{
		   		curr = temp.next;
		   		temp.next = prev;
		   		end  = curr;
		   		prev = temp;
		   		temp = curr;
		   		counter++;
		   	}
		   	if(counter-(n-m)==1){
		   		break;
		   	}
		    	
		 }
		 if(m==1){
			 head.next= end;
			 head = prev;
		 }
		 else{
			 start.next.next = end;
			 start.next = prev; 
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
