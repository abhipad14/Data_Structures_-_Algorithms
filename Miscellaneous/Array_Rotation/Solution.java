
package Array_Rotation;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		int k = 6;
		rotate(a, k);
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
	}

	
	
	public static void rotate(int[] a, int k){
		if(k>a.length){
			k = (a.length/k)*a.length-k;
		}
		if(k!=0  &&  k!=a.length){
			int counter = 0;
			int i=0;
			int temp1 = a[i];
			int temp2 = temp1;
			int dis = i+k;
			while(counter<a.length){
				if(dis>=a.length){
					dis = dis%a.length;
				}
				if(i>=a.length){
					i= i%a.length;
				}
				temp2 = a[dis];
				a[dis]= temp1;
				temp1 = temp2;
				i= i+k;
				dis = i+k;
				counter++;
			}
		}
	}
}
