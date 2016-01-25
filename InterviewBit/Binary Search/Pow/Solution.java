package Binary_Search.Pow;

public class Solution {
	public int pow(int x, int n, int d) {
		long rem = 1;
		long temp = x;	
		while(n>0){
			if(n%2==1){
				rem *= temp;
				rem %= d;
			}
			temp *= temp;
			temp %=d;
			n/=2;
		}
		rem = ((rem+d)%d);
		return (int)rem;
	}
}
