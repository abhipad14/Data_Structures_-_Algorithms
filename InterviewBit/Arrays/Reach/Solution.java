package Arrays.Arrays_Reach;

import java.util.ArrayList;

public class Solution {
	
	public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int output = 0;
        int size = X.size();
        for(int i=0; i<size-1; i++){
        	int dis1 = Math.abs(X.get(i)-X.get(i+1));
        	int dis2 = Math.abs(Y.get(i)-Y.get(i+1));
        	output += Math.max(dis1, dis2);
        }
        return output;
    }

	
}
