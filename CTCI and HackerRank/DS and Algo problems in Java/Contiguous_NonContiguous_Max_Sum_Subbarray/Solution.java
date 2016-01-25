package Contiguous_NonContiguous_Max_Sum_Subbarray;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int T = scanf.nextInt();
		int[] answer = new int[T*2];
		int count=0, maxc=0, maxcn=0, sum=0;
		for(int i=0; i<T; i++){
			int N = scanf.nextInt();
			int[] value = new int[N];
			int max=0;
			boolean flag = false;
			maxc=0;
			maxcn=0; 
			sum=0;
			for(int j=0; j<N; j++){
				value[j]=scanf.nextInt();
				if(value[j]>=0){
					flag = true;
					maxcn=maxcn+value[j];
				}
				if(j==0){
					max = value[j];
				}
				else if(value[j]>max){
					max = value[j];
				}
				sum = sum + value[j];
				if(sum>maxc){
					maxc = sum;
				}
				if(sum<0){
					sum=0;
				}
				
			}
			if(flag){
				answer[count]=maxc;
				answer[count+1]=maxcn;
				count += 2;
			}
			else{
				answer[count]=max;
				answer[count+1]=max;
				count += 2;
			}
		}
		for(int i=0; i<(2*T); i+=2){
			System.out.print(answer[i]+" "+answer[i+1]+"\n");
		}
	}
	

}
