package Flowers_Hackerrank_Algo_Greedy;

import java.awt.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    
	      int N, K;
	      N = in.nextInt();
	      K = in.nextInt();
	      
	      int C[] = new int[N];
	      for(int i=0; i<N; i++){
	         C[i] = in.nextInt();
	      }
	      
	      int result = 0;
	      Arrays.sort(C);
	      int temp;
	      for(int i=0; i<(N/2); i++){
	    	  temp = C[i];
	    	  C[i] = C[N-1-i];
	    	  C[N-1-i] = temp; 
	      }
	      int arrindex = 0;
	      int multipler=1;
	      while(arrindex<N){
	    	  int count = 0;
	    	  while(count<K  && arrindex<N){
	    		  result += C[arrindex]*multipler;
	    		  arrindex++;
	    		  count++;
	    	  }
	    	  multipler++;
	      }
	      
	      System.out.println( result );

	}

}
