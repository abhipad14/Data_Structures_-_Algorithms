package Strings.Longestpalin;

public class Solution {
	public String longestPalindrome(String a) {
		StringBuilder answer = new StringBuilder();
		StringBuilder temp = new StringBuilder();
		temp.append('$');
		int lenori = a.length();
		for(int i=0; i<lenori; i++){
			temp.append('#');
			temp.append(a.charAt(i));
		}
		temp.append('#');
		temp.append('@');
		
		int lennew = temp.length();
		int[] p = new int[lennew];
		
		int c = 0, r=0; 
		for(int i=1; i<lennew-1; i++){
			int mirr = 2*c-i;
			if(i<r){
				p[i]=Math.min(r-i, p[mirr]);
			}
			while(temp.charAt(i+(1+p[i]))==temp.charAt(i-(1+p[i]))){
				p[i]++;
			}
			if(i+p[i]>r){
				c=i;
				r = i+p[i];
			}
		}
		int max = -1;
		int maxindex = -1;
		for(int i=0; i<lennew; i++){
			if(p[i]>max){
				max = p[i];
				maxindex = i;
				c = i;
			}
		}
		
		for(int i=c-p[c]+1; i<c+p[c]; i++){
			if(temp.charAt(i)!='#'){
				answer.append(temp.charAt(i));
			}
		}
		return answer.toString();
	}
}
