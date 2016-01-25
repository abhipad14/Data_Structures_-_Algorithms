package Math.Gcd2;

import java.util.Arrays;

public class Gcd {

	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10};
		
		System.out.println(GCD(arr));
	}

	
	public static int gcd(int[]  a){
		int ans = 1;
		int x, y, r, low=0;
		for(int i=1; i<a.length; i++){
			if(a[0]>a[i]){
				x = a[0];
				y = a[i];
			}
			else{
				x = a[i];
				y = a[0];
			}
			while((r=x%y)!=0){
				x = y;
				y = r;
			}
			if(i==1){
				low = y;
				ans = low;
			}
			if(y < low){
				low = y;
				ans = low;
			}
			if(y == 1){
				return 1;
			}
		}
		
		return ans;
	}


	public static int GCD(int[] a){
		int ans =1, counter =0;
		Arrays.sort(a);
		for(int i = a[0]; i>=1; i--){
			for(int j=0; j<a.length; j++){
				if(a[j]% i == 0){
					counter++;
				}
			}
			if(counter == a.length){
				ans = i;
				break;
			}
		}
		return ans;
	}
}
