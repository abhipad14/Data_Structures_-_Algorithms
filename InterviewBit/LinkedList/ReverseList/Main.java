package LinkedList.ReverseList;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int  n = scanf.nextInt();
		ListNode head=null;
		ListNode temp= null;
		for(int i=0; i<n; i++){
			if(i==0){
				head = new ListNode(scanf.nextInt());
				temp = head;
			}
			else{
				temp.next = new ListNode(scanf.nextInt());
				temp = temp.next;
			}
		}
		int m = scanf.nextInt();
		n = scanf.nextInt();
		Solution ans = new Solution();
		head = ans.reverseBetween(head, m, n);
		temp = head;
		while(temp!=null){
			System.out.print(temp.val+"-->");
			temp = temp.next;
		}
	}

}
