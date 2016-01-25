package LinkedList.RemDupLink2;



class ListNode {
	public int val;
	public ListNode next;
	ListNode(int x) { val = x; next = null; }
}


public class Solution {
	public ListNode deleteDuplicates(ListNode a) {
		if(a == null) return a;
        ListNode helper = new ListNode(0);
        helper.next = a;
        ListNode pre = helper, cur = a;
        while(cur!=null)
        {
            while(cur.next!=null && pre.next.val==cur.next.val)
                cur = cur.next;
            if (pre.next == cur) 
                pre = pre.next;
            else 
                pre.next = cur.next;
            cur = cur.next;
        }
        return helper.next;
	}	
}
