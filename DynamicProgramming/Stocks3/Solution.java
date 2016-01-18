package DynamicProgramming.Stocks3;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public int maxProfit(ArrayList<Integer> a) {
		int len = a.size();
		if(len==0) return 0;
        int k = 2;
        int[][] profit = new int[k+1][len];
        for(int i=0; i<=k; i++){
            profit[i][0] = 0;
        }
        for(int i=0; i<len; i++){
            profit[0][i] = 0;
        }
        int diff = Integer.MIN_VALUE;
        for(int i=1; i<=k; i++){
        	diff = 0-a.get(0);
            for(int j=1; j<len; j++){
                profit[i][j] = Math.max(profit[i][j-1], a.get(j)+diff);
                diff = Math.max(diff, profit[i-1][j] - a.get(j));
            }
        }
        return profit[k][len-1];
	}
}
