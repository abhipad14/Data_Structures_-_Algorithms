package Math.Math_Factorial;

public class Solution {
	public int trailingZeroes(int a) {
		int count = 0;
		if (a < 0) {
			return -1;
		}
		for (int i = 5; a / i > 0; i *= 5) {
			count += a / i;
		}
		return count;
	}
	
	
}
