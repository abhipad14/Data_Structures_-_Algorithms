/*
Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
*/


public class Solution {
    public int titleToNumber(String s) {
        int answer = 0;
		
		int size = s.length();
		int power;
		for(int i=size-1; i>=0; i--){
			char temp = s.charAt(i);
			int value = temp-'A';
			power = size-1-i;
			answer += ++value*Math.pow(26, power);
		}
		return answer;
    }
}