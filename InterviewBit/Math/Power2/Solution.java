package Math.Math_Power2;

public class Solution {
	public boolean isPower(int a) {
		boolean answer = false;
		if(a<1){
			return answer;
		}
		if(a==1){
			return true;
		}
		int n = (int)Math.sqrt(a);
		for(int i=2; i<=n; i++){
			for(int j=2; j<=a; j++){
				if(Math.pow(i, j)==a){
					answer = true;
					return answer;
				}
				if(Math.pow(i, j)>a){
					break;
				}
				
			}
		}
		return answer;
    }

}
