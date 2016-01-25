package LinkedList.Swapl;

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
		
		Solution ans = new Solution();
		head = ans.swapPairs(head);
		temp = head;
		while(temp!=null){
			System.out.print(temp.val+"-->");
			temp = temp.next;
		}

	}

}
