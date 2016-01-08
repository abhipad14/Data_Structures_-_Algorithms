package BackTracking.ModExpRec;

public class Solution {
	public int Mod(int a, int b, int c) {
		long res = 1;
	    long y = a;
	    while (b > 0) {
	        if (b % 2 == 1) {
	            res = res * y;
	            res %= c;
	        }
	        y = y * y;
	        y %= c;
	        b /= 2; 
	    }
	    res %= c;
	    res = (res + c) % c;
	    return (int) res;
	}
	
	
}
