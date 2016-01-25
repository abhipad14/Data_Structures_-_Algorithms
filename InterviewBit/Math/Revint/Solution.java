package Math.Math_Revint;

public class Solution {
	public int reverse(int a) {
		int answer = 0;
		int count = 0;
		String max = Integer.toString(Integer.MAX_VALUE);
		
		boolean neg = false;
		if(a<0){
			neg = true;
			a= 0-a;
		}
		int c = a;
		while(a>0){
			a=a/10;
			count++;
		}
		int len = count;
		boolean flag = true;
		int number = 0;
		while(c>0){
			if(len==10 && flag){
				StringBuffer temp = new StringBuffer();
				temp.append(max.charAt(len-count));
				if((c%10)>Integer.parseInt(temp.toString())){
					return 0;
				}
				if((c%10)!=Integer.parseInt(temp.toString())){
					flag = false;
				}
				
			}
			number += (Math.pow(10, --count))*(c%10);
			c/=10;
		}
		answer = number;
		if(neg){
			return -answer;
		}
		return answer;
	}

}
