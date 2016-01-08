package Arrays.Arrays_LargestNum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
	public String largestNumber(ArrayList<Integer> a) {
		StringBuffer answer = new StringBuffer();
		StringBuffer tempst = new StringBuffer();
		ArrayList<String> temp = new ArrayList<>();
		int size = a.size();
		
		for(int i=0; i<size; i++){
			
			temp.add(a.get(i).toString());
		}
		Collections.sort(temp, new costumeComparator());
		Collections.reverse(temp);
		
		for(int i=0; i<size; i++){
			tempst.append(temp.get(i));
		}
		int len = tempst.toString().length();
		boolean flag = false;
		for(int i=0; i<len; i++){
			if(tempst.charAt(i)>'0'){
				flag = true;
				answer.append(tempst.charAt(i));
			}
			else{
				if(flag){
					answer.append(tempst.charAt(i));
				}
			}
		}
		if(!flag){
			answer.append("0");
		}
		return answer.toString();
	}
	

	class costumeComparator implements Comparator<String>{

		@Override
		public int compare(String s1, String s2) {
			int len1 = s1.length();
			int len2 = s2.length();
			if(len1==len2){
				for(int i=0; i<len1; i++){
					if(s1.charAt(i)<s2.charAt(i)){
						return -1;
					}
					else if(s1.charAt(i)>s2.charAt(i)){
						return 1;
					}
				}
				return 0;
			}
			else{
				StringBuffer cs1 = new StringBuffer();
				StringBuffer cs2 = new StringBuffer();
				cs1.append(s1+s2);
				cs2.append(s2+s1);
				return compare(cs1.toString(), cs2.toString());
			}
			
		}
		
	}
}
