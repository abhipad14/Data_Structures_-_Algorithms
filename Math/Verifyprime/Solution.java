package Math.Math_Verifyprime;

public class Solution {
	public int isPrime(int a) {
		if(a<=1){
			return 0;
		}
		 int n = (int)Math.sqrt(a);
		 int answer = 1;
		 for(int i=2; i<=n; i++){
			 if(a%i==0){
				 answer = 0;
				 break;
			 }
		 }
		 return answer;
		}

}
