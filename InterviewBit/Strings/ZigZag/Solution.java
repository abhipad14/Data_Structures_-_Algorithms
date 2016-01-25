package Strings.ZigZag;

import java.util.ArrayList;

public class Solution {
	public String convert(String a, int b) {
		if(b==1){
			return a;
		}
		int len = a.length();
		ArrayList<StringBuilder> answer = new ArrayList<>();
		for(int i=0; i<b; i++){
			StringBuilder dummy = new StringBuilder();
			answer.add(dummy);
		}
		int i=0, j=0;
		while(i<len){
			j=0;
			if(j==0){
				if(i!=0){
					j++;
				}
				while(j<b  && i<len){
					StringBuilder temp = answer.get(j);
					if(temp.length()==0){
						temp = new StringBuilder();
						temp.append(a.charAt(i));
						answer.set(j, temp);
					}
					else{
						temp.append(a.charAt(i));
						answer.set(j, temp);
					}
					i++;
					j++;
				}
			}
			if(j==b){
				j-=2;
				while(j>=0 && i<len){
					StringBuilder temp = answer.get(j);
					if(temp.length()==0){
						temp = new StringBuilder();
						temp.append(a.charAt(i));
						answer.set(j, temp);
					}
					else{
						temp.append(a.charAt(i));
						answer.set(j, temp);
					}
					i++;
					j--;
				}
			}
		}
		StringBuilder zigzag = new StringBuilder();
		for(StringBuilder str: answer){
			int lenstr = str.length();
			for(int k=0; k<lenstr; k++){
				zigzag.append(str.charAt(k));
			}
		}
		return zigzag.toString();
	}

}
