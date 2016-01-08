package LinkedList.LPlain;

import java.util.ArrayList;

class ListNode {
	public int val;
	public ListNode next;
	ListNode(int x) { val = x; next = null; }
}


public class Solution {
	public int lPalin(ListNode A) {
		int answer = 1;
		int len = findLength(A);
		if(len==1){
		    return answer;
		}
		int mid  = len/2;
		int count = 0;
		ListNode temp = A;
		ArrayList<Integer> val = new ArrayList<>(); 
		while(temp!=null){
			count++;
			temp = temp.next;
			if(count == mid){
				break;
			}
		}
		
		if(len%2==1){
			temp = temp.next;
		}
		
		while(temp!=null){
			val.add(temp.val);
			temp = temp.next;
		}
		temp = A;
		count=0;
		while(temp!=null){
		    count++;
			if(temp.val!= val.get(val.size()-count)){
				answer = 0;
				break;
			}
			
			temp = temp.next;
			
			if(count==mid){
			    break;
			}
		}
		return answer;
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
