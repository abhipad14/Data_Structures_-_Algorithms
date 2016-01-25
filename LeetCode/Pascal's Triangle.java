/*
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*/


public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        if(numRows==0) return answer;
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        answer.add(temp);
        if(numRows==1) return answer;
        temp = new ArrayList<>();
        temp.add(1);
        temp.add(1);
        answer.add(temp);
        if(numRows==2) return answer;
        int count = 2;
        int size = answer.size();
        while(count<numRows){
            List<Integer> prev = answer.get(size-1);
            List<Integer> curr = new ArrayList<>();
            int n = prev.size()/2;
            curr.add(1);
            for(int i=0; i<n; i++){
                curr.add(prev.get(i)+prev.get(i+1));
            }
            int len = curr.size();
            
            for(int i=count%2==0? len-2:len-1; i>0; i--){
                curr.add(curr.get(i));
            }
            curr.add(1);
            answer.add(curr);
            count++;
            size++;
        }
        return answer;
    }
}
