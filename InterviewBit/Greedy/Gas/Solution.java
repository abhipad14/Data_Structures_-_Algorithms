package Greedy.Gas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {		
	public int canCompleteCircuit(ArrayList<Integer> gas, ArrayList<Integer> cost) {
		int len = gas.size(), pos = -1, currgas = 0, currdis = 0, required = 0;
		boolean flag = true;
		for(int i=0; i<len; i++){
			if(flag){
				pos = i;
				flag = false;
			}
			currgas += gas.get(i);
			currdis += cost.get(i);
			if(currgas - currdis <0){
				required += currdis - currgas;
				currgas = 0;
				currdis = 0;
				flag = true;
			}
		}
		if(currgas-currdis>=required){
			return pos;
		}
		else{
			return -1;
		}
	}
}
