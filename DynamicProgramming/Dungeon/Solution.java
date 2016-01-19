package DynamicProgramming.Dungeon;

import java.util.ArrayList;

public class Solution {
	
	public int calculateMinimumHP(ArrayList<ArrayList<Integer>> a) {
		int m = a.size();
		if(m==0) return 0;
		int n = a.get(0).size();
		int[][] energy = new int[m][n];
		for(int i = m-1; i>= 0; i--){
            for(int j = n-1; j >= 0; j--){
                if(i == m-1 && j == n-1) energy[i][j] = a.get(i).get(j) >= 0 ? 1 : 1-a.get(i).get(j);
                else{
                    int minToNext = (i == m-1) ? energy[i][j+1] : ((j==n-1) ? energy[i+1][j] : Math.min(energy[i+1][j], energy[i][j+1]));
                    energy[i][j] = a.get(i).get(j) >= minToNext ? 1 : minToNext - a.get(i).get(j);
                }
            }
        }
        return energy[0][0]; 
	}
	
}
