package Arrays.Arrays_Hotel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	
	
	
	public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
		boolean possibility = true;
		
		int size  = arrive.size();
		Collections.sort(arrive);
		Collections.sort(depart);
		int room = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i=0; i<size; i++){
			q.add(depart.get(i));
		}
		for(int i=0; i<size; i++){
			if(!q.isEmpty() && arrive.get(i)<q.peek()){
				room++;
			}
			else{
				while(!q.isEmpty() && q.peek()<=arrive.get(i)){
					q.remove();
					room--;
				}
				room++;
			}
			if(room>K){
				possibility = false;
				break;
			}
		}
		return possibility;
	}
}

	

