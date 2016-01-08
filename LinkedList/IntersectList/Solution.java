package LinkedList.IntersectList;
class ListNode {
	public int val;
	public ListNode next;
	ListNode(int x) { val = x; next = null; }
}



public class Solution {
	public ListNode getIntersectionNode(ListNode a, ListNode b) {
		ListNode merge = null;
		int len1 = findLength(a);
		int len2 = findLength(b);
		if(len1>len2){
			int diff = len1-len2;
			while(diff>0){
    			a = a.next;
    			diff--;
    		} 
			
		}
		else{
		   int diff = len2-len1;
    		while(diff>0){
    			b = b.next;
    			diff--;
    		} 
		}
		

		while(a!=null  && b!=null){
			if(a==b){
				merge = a;
				break;
			}
			a = a.next;
			b= b.next;
		}
		
		
		return merge;
				
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
