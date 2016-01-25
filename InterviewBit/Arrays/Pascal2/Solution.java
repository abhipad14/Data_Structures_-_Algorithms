package Arrays.Arrays_Pascal2;

import java.util.ArrayList;

public class Solution {
	public ArrayList<Integer> getRow(int a) {
		ArrayList<Integer> answer = new ArrayList<>();
		ArrayList<Integer> temp = new ArrayList<>();
		if(a==0){
			answer.add(1);
			return answer;
		}
		else if(a==1){
			answer.add(1);
			answer.add(1);
			return answer;
		}
		else{
			temp.add(1);
			temp.add(1);
			for(int i=1; i<=a; i++){
				temp = answer;
				answer = new ArrayList<>();
				answer.add(1);
				int len = temp.size();
				for(i=1; i<len; i++){
					answer.add(temp.get(i)+temp.get(i-1));
				}
				answer.add(1);
			}
			return answer;
		}
		
	}
}
