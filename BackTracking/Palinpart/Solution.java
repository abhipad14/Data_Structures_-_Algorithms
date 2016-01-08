package BackTracking.Palinpart;

import java.util.ArrayList;

public class Solution {
	public ArrayList<ArrayList<String>> partition(String a){
		ArrayList<ArrayList<String>> answer = new ArrayList<>();
		boolean[][] subStrPali = new boolean[a.length()][a.length()];
		tableOfPali(a, subStrPali);
		ArrayList<String> str = new ArrayList<>();
		getAllCombi(answer, str, a, subStrPali, a.length(), 0);
		return answer;
	}
	
	public void tableOfPali(String a, boolean[][] table){
		int len = a.length();
		for(int i=0; i<len; i++){
			for(int j=i; j<len; j++){
				if(isPalindrome(a.substring(i, j+1))){
					table[i][j]= true;
				}
				else{
					table[i][j]=false;
				}
			}
		}
	}
	
	public void getAllCombi(ArrayList<ArrayList<String>> answer, ArrayList<String> str, String a, boolean[][] table, int size, int count){
		if(a.length()>0){
			int len = a.length();
			for(int i=0; i<len; i++){
				ArrayList<String> temp = new ArrayList<>();
				temp.addAll(str);
				if(table[size-len][size-len+i]){
						count = size-len;
						temp.add(a.substring(0, i+1));
						count = count+a.substring(0, i+1).length();
					getAllCombi(answer, temp, a.substring(i+1), table, size, count);
					if(count==size){
						answer.add(temp);
					}
				}
				
			}
		}
	}
	
	public boolean isPalindrome(String str){
		boolean pali = true;
		int len = str.length();
		for(int i=0; i<len/2; i++){
			if(str.charAt(i)!=str.charAt(len-1-i)){
				return false;
			}
		}
		return pali;
	}
}
