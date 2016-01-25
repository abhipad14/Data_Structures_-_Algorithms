/*
Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

For example, given
s = "leetcode",
dict = ["leet", "code"].

Return true because "leetcode" can be segmented as "leet code".
*/


public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        boolean[] word = new boolean[s.length()+1];
        word[0] = true; 
        int length = s.length();
        for(int i=0; i<length; i++){
        	if(word[i]){
        		for(String a: wordDict){
        			int len = a.length();
        			int end = i + len;
        			if(end > s.length())
        				continue;
    
        			if(word[end]) continue;
    
        			if(s.substring(i, end).equals(a)){
        				word[end] = true;
        			}
        		}
        	}
        }
 
        return word[length];
    }
}