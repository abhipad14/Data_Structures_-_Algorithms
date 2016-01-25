package Strings.Multiply;

public class Solution {
	public String multiply(String a, String b) {
		StringBuilder answer = new StringBuilder();
		int len1 = a.length();
		int len2 = b.length();
		int index1=-1, index2=-1;
		for(int i=0; i<len1; i++){
			if(a.charAt(i)>'0'){
				index1 = i;
				break;
			}
		}
		
		for(int i=0; i<len2; i++){
			if(b.charAt(i)>'0'){
				index2 = i;
				break;
			}
		}
		if(index2==-1 || index1==-1){
			return "0";
		}
		
		StringBuilder num1 = new StringBuilder();
		StringBuilder num2 = new StringBuilder();
		StringBuilder temp = new StringBuilder();
		StringBuilder prev = new StringBuilder();
		for(int i=index1; i<len1; i++){
			num1.append(a.charAt(i));
		}
		for(int i=index2; i<len2; i++){
			num2.append(b.charAt(i));
		}
		len1 = num1.length();
		len2 = num2.length();
		if(len2>len1){
			temp = num2;
			num2 = num1; 
			num1 = temp;
			len1 = num1.length();
			len2 = num2.length();
			temp = new StringBuilder();
		}
		int carry = 0;
		for(int i=len2-1; i>=0; i--){
			String one = num2.substring(i, i+1);
			int no1 = Integer.parseInt(one);
			carry = 0;
			for(int k=0; k<(len2-1-i); k++){
				temp.append('0');
			}
			for(int j=len1-1; j>=0; j--){
				String two = num1.substring(j, j+1); 
				int no2 = Integer.parseInt(two);
				int multi = carry + no1*no2;
				carry = multi/10;
				temp.append(Integer.toString(multi%10));
			}
			if(carry!=0){
				temp.append(Integer.toString(carry));
			}
			if(i<len2-1){
				prev = add(prev, temp.reverse());
			}
			else{
				prev = temp.reverse();
			}
			temp = new StringBuilder();
		}
		answer = prev;
		return answer.toString();
	}
	
	
	public StringBuilder add(StringBuilder one, StringBuilder two){
		StringBuilder answer = new StringBuilder();
		int len1 = one.length();
		int len2 = two.length();
		int carry = 0;
		int index1 = len1-1;
		int index2 = len2 -1;
		while(index1>=0 && index2>=0){
			String no1 = one.substring(index1, index1+1);
			String no2 = two.substring(index2, index2+1);
			int nu1 = Integer.parseInt(no1);
			int nu2 = Integer.parseInt(no2);
			int sum = carry+nu1+nu2;
			carry = sum/10;
			answer.append(Integer.toString(sum%10));
			index1--;
			index2--;
		}
		if(index1<0){
			while(index2>=0){
				String no2 = two.substring(index2, index2+1);
				int nu2 = Integer.parseInt(no2);
				int sum = carry+nu2;
				carry = sum/10;
				answer.append(Integer.toString(sum%10));
				index2--;
			}
		}
		else{
			while(index1>=0){
				String no1 = two.substring(index1, index1+1);
				int nu1 = Integer.parseInt(no1);
				int sum = carry+nu1;
				carry = sum/10;
				answer.append(Integer.toString(sum%10));
				index1--;
			}
		}
		if(carry!=0){
			answer.append(Integer.toString(carry));
		}
		return answer.reverse();
	}
}
