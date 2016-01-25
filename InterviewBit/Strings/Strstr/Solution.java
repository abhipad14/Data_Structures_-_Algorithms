package Strings.Strstr;

public class Solution {
	public int strStr(String haystack, String needle) {
		if(haystack==null || needle==null){
			return -1;
		}
		int answer = -1;
		int counter = 0;
		int len = haystack.length();
		int size = needle.length();
		for(int i=0; i<len; i++){
			if(haystack.charAt(i)==needle.charAt(0)){
				answer = i;
				counter = 1;
				for(int j=1; j<size; j++){
					if(i+j>=len){
						break;
					}
					else if(haystack.charAt(i+j)==needle.charAt(j)){
						counter++;
					}
				}
				if(counter==size){
					return answer;
				}
				
			}
		}
		if(counter==size){
			return answer;
		}
		else{
			return -1;
		}
		
	}
}
