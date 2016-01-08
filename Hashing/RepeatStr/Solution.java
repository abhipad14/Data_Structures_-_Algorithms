package Hashing.RepeatStr;

import java.util.HashMap;

public class Solution {
	public int lengthOfLongestSubstring(String a) {
		int answer = 0;
		int length = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		int len = a.length();
		int i;
		int start = 0;
		for(i=0; i<len; i++){
			char temp = a.charAt(i);
			if(map.containsKey(temp)){
				length = i-map.get(temp);
				int index = map.get(temp);
				for(int j=start; j<=index; j++){
					map.remove(a.charAt(j));
				}
				start = index+1;
				map.put(temp, i);
			}
			else{
				map.put(temp, i);
				length++;
			}
			answer = Math.max(answer, length);
		}
			
		
		
		return answer;
	}
}
