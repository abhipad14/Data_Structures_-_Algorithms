package Mark_Toys_Hackerrank_Algo_Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
        int n=stdin.nextInt(),k=stdin.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<n;i++) prices[i]=stdin.nextInt();
        
        int answer = 0;
        Arrays.sort(prices);
        int amount = k;
        int i =0;
        while(amount>=0){
            amount = amount-prices[i++];
            answer++;
        }
        
        System.out.println(answer-1);

	}

}
