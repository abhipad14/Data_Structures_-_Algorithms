package Arrays.Arrays_Spiral2;

import java.util.ArrayList;

public class Solution {
	public ArrayList<ArrayList<Integer>> generateMatrix(int a) {
		ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
		int[][] temp = new int[a][a];
		int count = a/2;
		if(a%2==1){
			temp [a/2][a/2] = a*a; 
		}
		int counter = 0;
		int index =1;
		while(counter<count){
			for(int i=0+counter; i<a-counter; i++){
				temp[counter][i] = index++;
			}
			for(int i=1+counter; i<a-counter; i++){
				temp[i][a-1-counter]=index++;
			}
			for(int i=a-2-counter; i>=0+counter; i--){
				temp[a-1-counter][i]=index++;
			}
			for(int i=a-2-counter; i>0+counter; i--){
				temp[i][0+counter]=index++;
			}
			counter++;
		}
		for(int i=0; i<a; i++){
			ArrayList<Integer> dummy = new ArrayList<>();
			for(int j=0; j<a; j++){
				dummy.add(temp[i][j]);
			}
			answer.add(dummy);
		}
		return answer;
	}
}
