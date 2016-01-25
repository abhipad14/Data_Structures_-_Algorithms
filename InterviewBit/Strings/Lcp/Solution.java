package Strings.Lcp;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public String longestCommonPrefix(ArrayList<String> a) {
		StringBuffer answer = new StringBuffer();
		int len = a.size();
		ArrayList<Integer> strlens = new ArrayList<>();
		for(int i=0; i<len; i++){
			strlens.add(a.get(i).length());
		}
		Collections.sort(strlens);
		int index = 0;
		boolean flag = true;
		while(index<strlens.get(0)  &&  flag){
			int counter=0;
			char temp = a.get(0).charAt(index);
			for(int i=1; i<len; i++){
				if(a.get(i).charAt(index)!=temp){
					flag = false;
					break;
				}
			}
			if(flag){
				answer.append(temp);
			}
			index++;
		}
		return answer.toString();
	}
}
