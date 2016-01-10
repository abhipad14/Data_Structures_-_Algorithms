package Find_Kth_Smallest_In_Order_N;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int max = -1;
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = scanf.nextInt();
		}
		int  k = scanf.nextInt();
		int answer=-1;
		int left = 0;
		int right = n-1;
		int prevl = left;
		int prevr = right;
		
		while(true){
			int count = 0;
			int rdm = left+(int)(Math.random()*(right-left+1));
			int value = a[rdm];
			max = -1;
			while(true){
				while(left<n && a[left]<=value){
					if(a[left]>max){
						max = a[left];
					}
					left++;
					count++;
				}
				while(right>=0 &&  a[right]> value ){
					right--;
				}
				if(left>=right){
					break;
				}
				swap(a, left, right);
			}
			if(count==k){
				answer = max;
				break;
			}
			else if(count>k){
				right = left-1;
				left = prevl;
				
			}
			else if(count<k){
				right = prevr;
				k = k - count;
			}
			prevl = left;
			prevr = right;
		}
		if(max>answer){
			answer = max;
		}
		System.out.println(answer);
	}

	
	public static void swap(int[] a, int l, int r){
		int temp = a[l];
		a[l] = a[r];
		a[r] = temp;
	}
}
