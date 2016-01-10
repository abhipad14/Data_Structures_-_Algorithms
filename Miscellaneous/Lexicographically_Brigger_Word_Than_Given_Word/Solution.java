package Lexicographically_Brigger_Word_Than_Given_Word;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int T = scanf.nextInt();
		String[] answer = new String[T];
		for(int i=0; i<T; i++){
			String word = scanf.next();
			int len = word.length();
			int end = len-1;
			int start = end-1;
			StringBuffer answer1 = new StringBuffer();
			answer[i] = getGreater(word, start, end, answer1, len).toString();
		}
		for(int i=0; i<T; i++){
			System.out.println(answer[i]);
		}
		
		
		
	}

	
	
	public static StringBuffer getGreater(String word, int start, int end, StringBuffer answer, int len){
		if(start<0){
			answer.append("no answer");
			return answer;
		}
		else if(word.charAt(start)>=word.charAt(end)){
			return getGreater(word, start-1, end-1, answer, len);
		}
		else if(word.charAt(start)<word.charAt(end)){
			answer.append(word.substring(0, start));
			char high='a';
			for(int i=start+1; i<len; i++){
				if(i==start+1){
					high = word.charAt(i);
				}
				else{
					if(word.charAt(i)<high && word.charAt(i)>word.charAt(start)){
						high = word.charAt(i);
					}
				}
			}
			answer.append(high);
			StringBuffer newright = new StringBuffer();
			int count = 0;
			for(int i=start; i<len; i++){
				if(word.charAt(i)==high && count==0){
					count++;
				}
				else{
					newright.append(word.charAt(i));
				}
			}
			char[] sorted = newright.toString().toCharArray();
			Arrays.sort(sorted);
			String nright = new String(sorted);
			answer.append(nright);
			return answer;
		}
		else{
			return answer;
		}
	}
}
