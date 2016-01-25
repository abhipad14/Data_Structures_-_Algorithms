/*Given an unsorted array of integers, find the length of longest increasing subsequence.

For example,
Given [10, 9, 2, 5, 3, 7, 101, 18],
The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may be more than one LIS combination, it is only necessary for you to return the length.

Your algorithm should run in O(n2) complexity.*/


public class Solution {
    public int lengthOfLIS(int[] nums) {
        int answer = 0;
		int len = nums.length;
		if(len==0) return 0;
		if(len==1) return 1;
		int[] count = new int[len];
		for(int i=0; i<len; i++){
			count[i]=1;
		}
		for(int i=1; i<len; i++){
			for(int j=0; j<i; j++){
				if(nums[i]>nums[j]){
					count[i] = Math.max(count[i], count[j]+1);
				}
			}
		}
		for(int i=0; i<len; i++){
			answer = Math.max(answer, count[i]);
		}
		return answer;
    }
}