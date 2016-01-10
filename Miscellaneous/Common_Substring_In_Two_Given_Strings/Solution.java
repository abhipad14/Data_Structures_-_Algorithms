package Common_Substring_In_Two_Given_Strings;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int T = scanf.nextInt();
		int[] answer = new int[T];
		for(int i=0; i<T; i++){
			String A = scanf.next();
			String B = scanf.next();
			if(subString(A,B)){
				answer[i]=1;
			}
		}
		for(int i=0; i<T; i++){
			if(answer[i]==1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	
	public static boolean subString(String A, String B){
		boolean found = false;
		int[] count1 = new int[26];
		int[] count2 = new int[26];
		for(int i=0; i<A.length(); i++){
			count1[A.charAt(i)-'a']++;
		}
		for(int i=0; i<B.length(); i++){
			count2[B.charAt(i)-'a']++;
		}
		for(int i=0; i<26; i++){
			if(count1[i]>0  &&  count2[i]>0){
				found = true;
				break;
			}
				
		}
		return found;
	}
	
}
