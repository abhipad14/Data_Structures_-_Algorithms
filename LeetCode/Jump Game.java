/*
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

For example:
A = [2,3,1,1,4], return true.

A = [3,2,1,0,4], return false.
*/


public class Solution {
    public boolean canJump(int[] a) {
		int min = 0, max = 0;
		int len = a.length;
		if(len==1) return true;
		for(int i=0; i<len; i++){
			if(i>=min  &&  i<=max){
				if(i==0){
					min = i+1;
					max = i+a[i];
				}
				else{
					if(i+a[i]>max){
						max = i+a[i];
					}
					if(max>=len-1){
						return true;
					}
				}
			}
			else{
				return false;
			}
		}
		return false;
    }
}