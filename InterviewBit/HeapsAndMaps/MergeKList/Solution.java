package HeapsAndMaps.MergeKList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

class ListNode {
     public int val;
     public ListNode next;
     ListNode(int x) { val = x; next = null; }
}


public class Solution {
	
	ListNode head, temp;
	public ListNode mergeKLists(ArrayList<ListNode> a) {
		head = null;
		while(true){
			HashMap<ListNode, Integer> map = new HashMap<>();
			ArrayList<ListNode> list = new ArrayList<>();
			for(int i=0; i<a.size(); i++){
				if(a.get(i)!=null){
					list.add(a.get(i));
					map.put(a.get(i), i);
				}
			}
			if(map.size()==0){
				break;
			}
			Collections.sort(list, new myComparator());
			ArrayList<ListNode> num = new ArrayList<>();
			for(int i=0; i<list.size(); i++){
				if(i==0){
					num.add(list.get(i));
				}
				else{
					if(list.get(i).val!=list.get(i-1).val){
						break;
					}
					else{
						num.add(list.get(i));
					}
				}
			}
			add(num);
			for(int i=0; i<num.size(); i++){
				int index = map.get(num.get(i));
				a.set(index, a.get(index).next);
			}
		}
		return head;
	}
	
	
	public void add(ArrayList<ListNode> num){
		for(int i=0; i<num.size(); i++){
			if(head == null){
				head = new ListNode(num.get(i).val);
				temp = head;
			}
			else{
				temp.next = new ListNode(num.get(i).val);
				temp = temp.next;
			}
		}
	}
	
	 
	class myComparator implements Comparator<ListNode>{

		@Override
		public int compare(ListNode o1, ListNode o2) {
			if(o1.val<o2.val) return -1;
			else if (o1.val>o2.val) return 1;
			return 0;
		}	
	}
}
