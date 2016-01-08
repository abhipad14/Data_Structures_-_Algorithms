package BackTracking.GreyCode;

import java.util.ArrayList;

public class Solution {
	public ArrayList<Integer> grayCode(int a) {
		ArrayList<Integer> answer = new ArrayList<>();
		int max = 0;
		for(int i=a-1; i>=0; i--){
			max += (int)Math.pow(2, i);
		}
		for(int i=0; i<=max; i++){
			answer.add(toDecimal(toGray(toBinary(i, a))));
		}
		return answer;
	}
	
	
	public String toBinary(int a, int len){
		StringBuilder binary = new StringBuilder();
		int q = a;
		while(q!=0){
			int rem = q%2;
			q = q/2;
			binary.append(Integer.toString(rem));
		}
		if(binary.length()!=len){
			int diff = len - binary.length();
			for(int i=1; i<=diff; i++){
				binary.append('0');
			}
		}
		binary.reverse();
		
		return binary.toString();
	}

	
	public int toDecimal(String binary){
		int len = binary.length();
		int deci = 0;
		for(int i=len-1; i>=0; i--){
			if(binary.charAt(i)=='1'){
				deci = deci + (int)Math.pow(2, len-i-1);
			}
		}
		return deci;
	}


	public String toGray(String binary){
		StringBuilder gray = new StringBuilder();
		int len = binary.length();
		for(int i=0; i<len; i++){
			if(i==0){
				gray.append(binary.charAt(i));
			}
			else{
				char prev = binary.charAt(i-1);
				char curr = binary.charAt(i);
				if((prev=='1' && curr =='0') ||  (prev=='0' && curr=='1')){
					gray.append('1');
				}
				else{
					gray.append('0');
				}
			}
		}
		return gray.toString();
	}
}
