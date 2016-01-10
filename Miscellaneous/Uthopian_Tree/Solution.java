package Uthopian_Tree;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		boolean spring = false;
		boolean summer = false;
		int T = scanf.nextInt();
		int[] answer = new int[T];
		int height = 1;
		for(int i=0; i<T; i++){
			int c = scanf.nextInt();
			height = 1;
			if(c>0){
				spring = true;
				for(int j=0; j<c; j++){
					if(spring){
						height *= 2;
						summer = true;
						spring = false;
						continue;
					}
					if(summer){
						height += 1;
						summer = false;
						spring = true;
						continue;
					}
				}
				answer[i] = height;
			}
			else{
				answer[i]=height;
			}
		}
		for(int i=0; i<T; i++){
			System.out.println(answer[i]);
		}
	}

}
