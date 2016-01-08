package Arrays.Arrays_Pascal1;

import java.util.ArrayList;

public class Solution {
	public ArrayList<ArrayList<Integer>> generate(int a) {
		ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
		if(a==0){
			return answer;
		}
		else if(a==1){
			ArrayList<Integer> temp = new ArrayList<>();
			temp.add(1);
			answer.add(temp);
		}
		else if(a==2){
			ArrayList<Integer> temp = new ArrayList<>();
			temp.add(1);
			answer.add(temp);
			
			ArrayList<Integer> temp1 = new ArrayList<>();
			temp1.add(1);
			temp1.add(1);
			answer.add(temp1);
		}
		else{
			ArrayList<Integer> temp = new ArrayList<>();
			temp.add(1);
			answer.add(temp);
			
			ArrayList<Integer> temp1 = new ArrayList<>();
			temp1.add(1);
			temp1.add(1);
			answer.add(temp1);
			for(int i=2; i<a; i++){
				ArrayList<Integer> temp2 = new ArrayList<>();
				temp2.add(1);
				int len = answer.get(i-1).size();
				for(int j=1; j<len; j++){
					temp2.add(answer.get(i-1).get(j)+answer.get(i-1).get(j-1));
				}
				temp2.add(1);
				answer.add(temp2);
			}
		}
		
		return answer;
	}
}
