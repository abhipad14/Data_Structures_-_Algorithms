package Arrays.Arrays_Flip;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public ArrayList<Integer> flip(String A) {
		ArrayList<Integer> answer = new ArrayList<>();
		int len = A.length();
		char[] bi = A.toCharArray();
		int[] arr = new int[len];
		int start = -1;
		for(int i=0; i<len; i++){
			if(bi[i]=='1'){
				arr[i]=-1;
			}
			else{
				if(start==-1){
					start = i;
				}
				
				arr[i]=1;
			}
		}
		if(start==-1){
			return answer;
		}
		else{
			answer.add(-1);
			answer.add(-1);
			int sum = 0;
			int max =-1;
			int left = start-1, right=-1;
			for(int i=start; i<len; i++){
				sum+=arr[i];
				
				if(sum>max){
					max  = sum;
					right = i;
					answer.set(0, left+2);
					answer.set(1, right+1);
				}
				if(sum<0){
					left = i;
					sum = 0;
				}
			}
			return answer;
		}
		
    }
}
