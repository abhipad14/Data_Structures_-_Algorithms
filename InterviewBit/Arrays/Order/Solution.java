package Arrays.Order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class node{
	int height;
	int index;
	public node(int height, int index) {
		super();
		this.height = height;
		this.index = index;
	}
}

public class Solution {
	public ArrayList<Integer> order(ArrayList<Integer> heights, ArrayList<Integer> infronts) {
		int[] ans = new int[heights.size()];
		ArrayList<node> set = new ArrayList<>();
		for(int i=0; i<heights.size(); i++){
			set.add(new node(heights.get(i), i));
		}
		Collections.sort(set, new myComparator());
		for(int i=0; i<heights.size(); i++){
			ans[i] = -1;
		}
		for(int i=0; i<heights.size(); i++){
			int index = infronts.get(set.get(i).index);
			int place = find(ans, heights.size(), index);
			ans[place] = heights.get(set.get(i).index);
		}
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i=0; i<heights.size(); i++){
			answer.add(ans[i]);
		}
		return answer;
	}
	
	
	
	public int find(int[] ans, int len, int val){
		int answer = -1;
		int counter =0;
		for(int i=0; i<len; i++){
			if(ans[i]==-1){
				if(counter==val){
					answer = i;
					break;
				}
				counter++;
			}
		}
		return answer;
	}

	class myComparator implements Comparator<node>{

		@Override
		public int compare(node o1, node o2) {
			if(o1.height<o2.height) return -1;
			else if (o1.height>o2.height) return 1;
			return 0;
		}
	}
}
