package Pattern_Inside_Larger_Grid;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int T = scanf.nextInt();
		int[] answer = new int[T];
		boolean flag1 = false;
		for(int i=0; i<T; i++){
			int R = scanf.nextInt();
			int C = scanf.nextInt();
			String[] G = new String[R];
			for(int j=0; j<R; j++){
				G[j] = scanf.next();
			}
			
			int r = scanf.nextInt();
			int c = scanf.nextInt();
			String[] P = new String[r];
			for(int j=0; j<r; j++){
				P[j] = scanf.next();
			}
			int SRow = 0;
			int SColumn = 0;
			boolean flag = false;
			for(int j=0; j<R; j++){
				for(int k=0; k<C; k++){
					if(G[j].charAt(k) == P[0].charAt(0)){
						try{
							if(G[j].substring(k, k+c).equals(P[0])){
								SRow = j;
								SColumn = k;
								flag = true;
							}
						}
						catch (Exception name){
							continue;
						}
					}
					if(flag){
						int index = 1;
						int count = 1;
						for(int l = SRow+1; l<R; l++){
							if(G[l].substring(SColumn, SColumn+c).equals(P[index])){
								count++;
								index++;
							}
							if(count== r  || l-index != SRow-1){
								flag= false;
								break;
							}
					
						}
						if(count == r){
							answer[i]=1;
							flag1 = true;
							break;
						}
						
					}
				}
				if(flag1)
					break;
				
			}
		}
		
		for(int i=0; i<T; i++){
			if(answer[i]==1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		

	}

}
