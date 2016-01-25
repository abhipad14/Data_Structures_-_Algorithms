/*
Find the contiguous subarray within an array (containing at least one number) which has the largest product.

For example, given the array [2,3,-2,4],
the contiguous subarray [2,3] has the largest product = 6.
*/


public class Solution {
    public int maxProduct(int[] a) {
        int len = a.length;
        if(len==0) return 0;
        int[] posprod = new int[len];
        int[] negprod = new int[len];
        int answer = Integer.MIN_VALUE;
        posprod[0] = a[0];
        negprod[0] = a[0];
        answer = a[0];
        for(int i=1; i<len; i++){
        	int aa = posprod[i-1]*a[i];
        	int bb = negprod[i-1]*a[i];
        	posprod[i] = Math.max(Math.max(aa, bb), a[i]);
        	negprod[i] = Math.min(Math.min(aa, bb), a[i]);
        	answer = Math.max(answer, posprod[i]);
        }
        return answer;
    }
}