package Strings.Power;

public class Solution {
	public int power(String a) {
		
		StringBuilder num = new StringBuilder(a); 
		StringBuilder quo = new StringBuilder();
		int carry;
		if(num.length()==1){
			if(Integer.parseInt(num.substring(0, 1))%2==0){
				return 1;
			}
			else{
				return 0;
			}
		}
		while(true){
			int len = num.length();
			carry = 0;
			int prev = 0;
			for(int i=0; i<len; i++){
				String div = num.substring(prev, i+1);
				int divident = Integer.parseInt(div);
				int total = carry*10+divident;
				if(total!=1){
					carry = total%2;
					quo.append(Integer.toString(total/2));
					prev = i+1;
				}
				else if(i>0){
					carry = divident;
					prev = i+1;
					quo.append('0');
				}
				
			}
			num = quo;
			
			quo = new StringBuilder();
			if(num.length()==1 && num.charAt(0)=='2' || carry==1){
				break;
			}
		}
		if(carry == 1){
			return 0;
		}
		else{
			return 1;
		}
		
		
	}
}
