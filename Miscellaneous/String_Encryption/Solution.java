package String_Encryption;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		String message = scanf.next();
		int len = message.length();
		int low = (int) Math.floor(Math.sqrt(len));
		int high = (int) Math.ceil(Math.sqrt(len));
		int r,c;
		if(low*high >= len){
			 r = low;
			 c = 0;
			for(int i= low; i<=high; i++){
				if(low*i >= len){
					c = i;
					break;
				}
			}
		}
		else{
			r = high;
			c = high;
		}
		
		
		String[] divide = new String[r];
		int start = 0;
		int end = c;
		for(int i=0; i<r; i++){
			if(end < len){
				divide[i] = message.substring(start, end);
				start = end;
				end = start + c;
			}
			else if(end >= len){
				divide[i] = message.substring(start);
			}
		}
		int count = 0;
		for(int i=0; i<c; i++){
			for(int j=0; j<r; j++){
				try{
					System.out.print(divide[j].charAt(i));
				}
				catch (Exception e){
					continue;
				}
			}
			System.out.print(" ");
		}
	}

}
