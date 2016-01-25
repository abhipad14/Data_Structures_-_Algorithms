package BackTracking.Parenthesis;

import java.util.ArrayList;

public class Solution {
	public ArrayList<String> generateParenthesis(int a) {
		ArrayList<String> answer = new ArrayList<>();
		StringBuilder op = new StringBuilder();
		StringBuilder cl = new StringBuilder();
		for(int i=0; i<a; i++){
			op.append('(');
			cl.append(')');
		}
		StringBuilder brac = new StringBuilder();
		getCombi(a, a, answer, brac, op.toString(), cl.toString());
		return answer;
	}
	
	public void getCombi(int open, int close, ArrayList<String> answer, StringBuilder brac, String op, String cl){
		for(int i=open; i>=1; i--){
			StringBuilder temp = new StringBuilder();
			temp.append(brac.toString());
			temp.append(op.substring(0, i));
			if(i==open){
				temp.append(cl.substring(0, close));
				answer.add(temp.toString());
			}
			else{
				for(int j=1; j<=close-(open-i); j++){
					temp.append(')');
					getCombi(open-i, close-j, answer, temp, op, cl);
				}
			}
		}
	}
}
