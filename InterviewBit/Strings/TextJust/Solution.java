package Strings.TextJust;

import java.util.ArrayList;

public class Solution {
	public ArrayList<String> fullJustify(ArrayList<String> a, int b) {
		ArrayList<String> answer = new ArrayList<>();
		ArrayList<String> temp = new ArrayList<>();
		int size = a.size();
		int len =0, count;
		int i=0;
		while(i<size){
			count = 0;
			String word = a.get(i);
			if(word.length()==b){
				answer.add(word);
			}
			else{
				int nowords = 0;
				ArrayList<String> tempstr = new ArrayList<>();
				while(i<size){
					String word1 = a.get(i);
					count  += word1.length();
					
					if(count>b){
						count -= word1.length();
						i--;
						break;
					}
					else{
						nowords++;
						tempstr.add(word1);
						i++;
					}
					count++;
				}
				int remlen = b-(count-nowords);
				int numofspaces;
				if(nowords>1){
					numofspaces = remlen/(nowords-1);
				}
				else{
					numofspaces= remlen;
				}
				
				StringBuilder tempbul = new StringBuilder();
				for(int j=0; j<tempstr.size(); j++){
					
					tempbul.append(tempstr.get(j));
					int space = 0;
					
					if(remlen==numofspaces+1  && numofspaces!=1){
						numofspaces++;
					}
					while(space<numofspaces && remlen>0){
						tempbul.append(" ");
						space++;
						remlen--;
					}
				}
				answer.add(tempbul.toString());
			}
			i++;
		}
		String last = answer.get(answer.size()-1);
		int lastlen = last.length();
		StringBuilder lastword = new StringBuilder();
		int counter =0;
		for(int j=0; j<lastlen; j++){
			if(last.charAt(j)!=' '){
				counter=0;
				lastword.append(last.charAt(j));
			}
			else if(last.charAt(j)==' '){
				if(counter==0){
					lastword.append(" ");
					counter++;
				}
			}
			
		}
		int lastremlen = b-lastword.length();
		while(lastremlen>0){
			lastword.append(" ");
			lastremlen--;
		}
		answer.set(answer.size()-1, lastword.toString());
		
		return answer;
	}
}
