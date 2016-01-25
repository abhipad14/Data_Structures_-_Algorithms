package DynamicProgramming.MaxProd;

import java.util.ArrayList;

public class Solution {
	public int maxProduct(ArrayList<Integer> a) {
        int len = a.size();
        if(len==0) return 0;
        int[] posprod = new int[len];
        int[] negprod = new int[len];
        int answer = Integer.MIN_VALUE;
        posprod[0] = a.get(0);
        negprod[0] = a.get(0);
        answer = a.get(0);
        for(int i=1; i<len; i++){
        	int one = posprod[i-1]*a.get(i);
        	int two = negprod[i-1]*a.get(i);
        	posprod[i] = Math.max(Math.max(one, two), a.get(i));
        	negprod[i] = Math.min(Math.min(one, two), a.get(i));
        	answer = Math.max(answer, posprod[i]);
        }
        return answer;
    }
}
