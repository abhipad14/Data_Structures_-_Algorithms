package Arrays.Arrays_NextPerm;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

	public void nextPermutation(ArrayList<Integer> a) {
		int size = a.size();
		
		if(size>1){
			int i;
			boolean flag = false;
			for(i=size-1; i>0; i--){
				if(a.get(i)<a.get(i-1)){
					continue;
				}
				else{
					flag = true;
					break;
				}
			}
			if(flag){
				Collections.sort(a.subList(i, size));
				for(int j = i; j<size; j++){
					if(a.get(j)>a.get(i-1)){
						swap(i-1, j, a);
						break;
					}
				}
			}
			else{
				Collections.sort(a);
			}
			
			for(int j=0; j<size; j++){
				System.out.print(a.get(j)+" ");
			}
		}
		
	}
	
	
	
	public void swap(int i, int j, ArrayList<Integer> a){
		int temp = a.get(i);
		a.set(i, a.get(j));
		a.set(j, temp);
		
	}
}
