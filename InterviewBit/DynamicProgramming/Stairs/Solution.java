package DynamicProgramming.Stairs;

public class Solution {
	public int climbStairs(int a) {
		int answer = 0;
		if(a==0){
		    return 0;
		}
		int[] ways = new int[a+1];
		answer = count(a, ways);
		return answer;
	}
	
	
	public int count(int n, int[] ways){
		if(n<=0){
			return 1;
		}
		else if (n==1){
			return 1;
		}
		if(ways[n]!=0){
			return ways[n];
		}
		else{
			ways[n]=count(n-1, ways)+count(n-2, ways);
			return ways[n];
		}
	}
}
