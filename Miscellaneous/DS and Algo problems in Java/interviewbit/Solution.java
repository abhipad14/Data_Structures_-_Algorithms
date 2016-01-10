package interviewbit;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args){
		Scanner scanf = new Scanner(System.in);
		int m = scanf.nextInt();
		int n = scanf.nextInt();
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		for(int i=0; i<m; i++){
			ArrayList<Integer> list2 = new ArrayList<>();
			for(int j=0; j<n; j++){
				list2.add(scanf.nextInt());
			}
			list.add(list2);
		}
		ArrayList<Integer> result = spiralOrder(list);
		int size = result.size();
		for(int i=0; i<size; i++){
			System.out.print(result.get(i)+"->");		
		}
	}
	
	public static ArrayList<Integer> spiralOrder(final ArrayList<ArrayList<Integer>> a) {
			 
			ArrayList<Integer> result = new ArrayList<Integer>();
			int m = a.size();
			int n = a.get(0).size();
			int top = 0, bottom = m, left=0, right = n;
			while(top<bottom && left<right){
				int i=0,j=0,k=0;
				for(i=left; i<right; i++){
					result.add(a.get(top).get(i));
				}
				top++;
				i--;
				for(j= top; j<bottom; j++){
					int temp = a.get(j).get(i);
					result.add(temp);
					
				}
				right--;
				j--;
				if(top<bottom){
					for(k=right-1; k>=left; k--){
						int temp = a.get(j).get(k);
						result.add(temp);
						
					}
					bottom--;
					k++;
				}
				
				if(left<right){
					for(int l=bottom-1; l>=top; l--){
						int temp = a.get(l).get(k);
						result.add(temp);
						
					}
					left++;
				}
			}
			return result;
		}

}
