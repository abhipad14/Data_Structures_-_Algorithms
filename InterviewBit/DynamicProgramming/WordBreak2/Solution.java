package DynamicProgramming.WordBreak2;

import java.util.ArrayList;

public class Solution {
	public ArrayList<String> wordBreak(String a, ArrayList<String> b) {
		ArrayList<String> count[] = new ArrayList[a.length()+1];
        count[0] = new ArrayList<String>();
 
        for(int i=0; i<a.length(); i++){
            if( count[i] == null ) 
                continue; 
 
            for(String word:b){
                int len = word.length();
                int end = i+len;
                if(end > a.length()) 
                    continue;
 
                if(a.substring(i,end).equals(word)){
                    if(count[end] == null){
                        count[end] = new ArrayList<String>();
                    }
                 count[end].add(word);
                }
            }
        }
 
        ArrayList<String> answer = new ArrayList<String>();
        if(count[a.length()] == null) 
        return answer; 
 
        ArrayList<String> temp = new ArrayList<String>();
        dfs(count, a.length(), answer, temp);
 
        return answer;
	}
	
	
	
	public static void dfs(ArrayList<String> dp[],int end, ArrayList<String> result, ArrayList<String> tmp){
        if(end <= 0){
            String path = tmp.get(tmp.size()-1);
            for(int i=tmp.size()-2; i>=0; i--){
                path += " " + tmp.get(i) ;
            }
 
            result.add(path);
            return;
        }
 
        for(String str : dp[end]){
            tmp.add(str);
            dfs(dp, end-str.length(), result, tmp);
            tmp.remove(tmp.size()-1);
        }
    }
}
