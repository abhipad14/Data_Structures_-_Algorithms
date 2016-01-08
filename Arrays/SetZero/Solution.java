package Arrays.Arrays_SetZero;

import java.util.ArrayList;

public class Solution {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
		int m = a.size();
		int n = a.get(0).size();
		int[] I = new int[m];
		int[] J = new int[n];
		
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if(a.get(i).get(j)==0){
					I[i]=1;
					J[j]=1;
				}
			}
		}
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if(I[i]==1 || J[j]==1){
					a.get(i).set(j, 0);
				}
			}
		}
		
	}
}
