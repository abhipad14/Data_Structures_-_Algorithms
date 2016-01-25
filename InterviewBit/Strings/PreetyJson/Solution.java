package Strings.PreetyJson;

import java.util.ArrayList;

public class Solution {
	public ArrayList<String> prettyJSON(String a) {
		ArrayList<String> answer = new ArrayList<>();
		ArrayList<StringBuilder> uglyjson = new ArrayList<>();
		int len = a.length();
		int i = 0;
		StringBuilder temp = new StringBuilder();
		while(i<len){
			
			temp = new StringBuilder();
			if(a.charAt(i)=='{'  || a.charAt(i)=='[' || a.charAt(i)=='}' || a.charAt(i)==']'){
				temp.append(a.charAt(i));
				uglyjson.add(temp);
				i++;
			}
			else{
				while(i<len){
					if(a.charAt(i)==','){
						if(a.charAt(i-1)=='}'  ||  a.charAt(i-1)==']'){
							uglyjson.get(uglyjson.size()-1).append(a.charAt(i));
						}
						else{
							temp.append(a.charAt(i));
							uglyjson.add(temp);
						}
						i++;
						break;
					}
					else if(a.charAt(i)=='{'  || a.charAt(i)=='[' || a.charAt(i)=='}' || a.charAt(i)==']'){
						if(temp.length()!=0){
							uglyjson.add(temp);
						}
						break;
					}
					else{
						if(a.charAt(i)!=' '){
							temp.append(a.charAt(i));
						}
						
						i++;
					}
				}
			}
		}
		int tabcount= 0;
		for(StringBuilder s: uglyjson){
			StringBuilder dummy = new StringBuilder();
			if(s.charAt(0)=='{' ||  s.charAt(0)=='['){
				for(int j=1; j<=tabcount; j++){
					dummy.append("\t");
				}
				tabcount++;
			}
			else if(s.charAt(0)=='}' ||  s.charAt(0)==']'){
				for(int j=1; j<tabcount; j++){
					dummy.append("\t");
				}
				tabcount--;
			}
			else{
				for(int j=1; j<=tabcount; j++){
					dummy.append("\t");
				}
			}
			
			dummy.append(s.toString());
			answer.add(dummy.toString());
		}
		return answer;
	}
}
