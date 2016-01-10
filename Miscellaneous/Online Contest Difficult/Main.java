package Citrix_Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }
        
        int sum =0;
        int pos = 0;
        Arrays.sort(a);
       
        Arrays.sort(a);
        for(int i=0;i<a.length/2;i++) {
            
            int temp = a[i];
            a[i] = a[a.length-(i+1)];
            a[a.length-(i+1)] = temp;
       }
        int counter=0;
        while(counter<m){
        	if(n>1  &&  pos<(n-1)){
	        	if(a[pos] >= a[pos+1]  && a[pos]>0){
	        		if(pos >= 1){
	                	if(a[pos-1] > a[pos]){
	                		pos--;
	                	}
	                }
	        		if(a[pos]>0){
		        		sum = sum + a[pos];
		        		counter++;
		        		a[pos]--;
	        		}
	        		
	        	}
	        	else{
	        		if(pos >= 1){
	                	if(a[pos-1] > a[pos]){
	                		pos--;
	                	}
	                	else{
	                		pos++;
	                	}
	                }
	        		else
	        			pos++;
	        		
	        	}
        	}
            if(pos == n-1  &&  n>1){
            	if(a[pos] >0){
	                sum = sum + a[pos];
	                counter++;
	                a[pos]--;
            	}
                if(pos >= 1){
                	if(a[pos-1] > a[pos]){
                		pos--;
                	}
                }
            }
            if(n==1){
                sum = sum + a[pos];
                counter++;
                a[pos]--;
            }
        }
        System.out.println(sum);
	}

}
