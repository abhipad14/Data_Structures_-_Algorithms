package Math.Math_Gcd;

public class Solution {
	public int gcd(int a, int b) {
		if(b>a){
			int temp = a;
			a = b;
			b= temp;
		}
		if(b==0){
			return a;
		}
		int r = a%b;
		while(r!=0){
			a = b;
			b = r;
			r = a%b;
		}
		return b;
	}

}
