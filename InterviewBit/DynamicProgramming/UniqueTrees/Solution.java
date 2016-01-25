package DynamicProgramming.UniqueTrees;

public class Solution {
	public int numTrees(int a) {
		int answer = 0;
		int[] count = new int[a+1];
		count[0] = 1;
		count[1] = 1;
		for(int i=2; i<=a; i++){
			for(int j=0; j<i; j++){
				count[i] += count[j]*count[i-j-1];
			}
		}
		answer = count[a];
		return answer;
	}
}
