package Grid_Challange_Hackerrank_Algo_Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int t = scanf.nextInt();
		String[] answer = new String[t];
		String ans="YES";
		for(int i=0; i<t; i++){
			ans="YES";
			int n = scanf.nextInt();
			char[][] grid = new char[n][n];
			for(int j=0; j<n; j++){
				String word = scanf.next();
				for(int k=0; k<n; k++){
					grid[j][k] = word.charAt(k);
				}
			}

			if(n==1){
                answer[i]=ans;
            }
			else{
				for(int j=0; j<n; j++){
					Arrays.sort(grid[j]);
				}
				boolean flag = false;
				for(int j=0; j<n; j++){
					for(int k=1; k<n; k++){
						if(grid[k][j]<grid[k-1][j]){
							ans = "NO";
							flag = true;
							break;
						}
					}
					if(flag){
						break;
					}
				}
				answer[i]=ans;
			}
			
		}
		for(int i=0; i<t; i++){
			System.out.println(answer[i]);
		}

	}

}
