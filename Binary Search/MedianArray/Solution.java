package Binary_Search.MedianArray;

import java.util.ArrayList;

public class Solution {
	public double findMedianSortedArrays(ArrayList<Integer> a, ArrayList<Integer> b) {
		if(a.size()==0){
			if(b.size()%2==1){
				return b.get(b.size()/2);
			}
			else{
				int temp = b.get((b.size()-1)/2)+b.get(((b.size()-1)/2)+1);
				return temp/2.0;
			}
		}
		else if(b.size()==0){
			if(a.size()%2==1){
				return a.get(a.size()/2);
			}
			else{
				int temp = a.get((a.size()-1)/2)+a.get(((a.size()-1)/2)+1);
				return temp/2.0;
			}
		}
		double median = 0;
		int left1=0;
		int left2 = 0;
		int right1 = a.size()-1;
		int right2 = b.size()-1;
		while(left1<right1 &&  left2<right2){
			int mid1 = left1+(right1-left1)/2;
			int mid2 = left2 +(right2-left2)/2;
			int one = a.get(mid1);
			int two = b.get(mid2);
			if(one<two){
				left1 = mid1;
				right2=mid2;
			}
			else{
				right1=mid1;
				left2=mid2;
			}
		}
		int one = 0, two= 0;
		
			one = a.get(right1);
			two = b.get(right2);
		
		if((a.size()+b.size())%2==1){
			median = Math.max(one, two);
		}
		else{
			median = (one+two)/2.0;
		}
		return median;
	}
	
	
	
}
