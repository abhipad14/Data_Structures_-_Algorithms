package Ways_Of_Getting_Amount_From_Given_Setof_Infinite_Coins_of_Each_Dinomination;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int m = scanf.nextInt();
		int[] coins = new int[m];
		for(int i=0; i<m; i++){
			coins[i]=scanf.nextInt();
		}
		
		Arrays.sort(coins);
		int[][] answer = new int[m][n+1];
		for(int i=0; i<=n;i++){
			if(i==0){
				answer[0][0]=1;
			}
			else{
				if(i%coins[0]==0){
					answer[0][i]=1;
				}
				else{
					answer[0][i]=0;
				}
			}
		}
		for(int j=1; j<m; j++){
			for(int i=0; i<=n; i++){
				if(i==0){
					answer[j][0]=1;
				}
				else{
					if(coins[j]>i){
						answer[j][i]=answer[j-1][i];
					}
					else{
						if((i-coins[j])<0){
							answer[j][i] = answer[j-1][i];
						}
						else{
							answer[j][i] = answer[j-1][i]+answer[j][i-coins[j]];
						}
					}
					
				}
			}
		}
		
			System.out.println(answer[m-1][n]);

		
	}

}
