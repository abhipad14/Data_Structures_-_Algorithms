package Strings.Roman2int;

import java.util.HashMap;

public class Solution {
	public int romanToInt(String a) {
		int answer = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int len = a.length();
		int i=0;
		while(i<len){
			char temp = a.charAt(i);
			if(temp!='I'  && temp!='C'  && temp!='X'){
				answer = answer+map.get(temp);
				i++;
			}
			else{
				i++;
				if(temp=='I'){
					if(i<len){
						char temp2 = a.charAt(i);
						if(map.get(temp2)>map.get(temp)){
							answer = answer+map.get(temp2)-map.get(temp);
							i++;
						}
						else{
							answer = answer+map.get(temp);
						}
					}
					else{
						answer = answer+map.get(temp);
					}
				}
				else if(temp=='C'){
					if(i<len){
						char temp2 = a.charAt(i);
						if(map.get(temp2)>map.get(temp)){
							answer = answer+map.get(temp2)-map.get(temp);
							i++;
						}
						else{
							answer = answer+map.get(temp);
						}
					}
					else{
						answer = answer+map.get(temp);
					}
				}
				else if(temp=='X'){
					if(i<len){
						char temp2 = a.charAt(i);
						if(map.get(temp2)>map.get(temp)){
							answer = answer+map.get(temp2)-map.get(temp);
							i++;
						}
						else{
							answer = answer+map.get(temp);
						}
					}
					else{
						answer = answer+map.get(temp);
					}
				}
			}
			
		}
		return answer;
	}
}
