package Check_Winner_Of_Tic_Tac_Toe;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		int[][] board = new int[3][3];
		Scanner scanf = new Scanner(System.in);
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				board[i][j]= scanf.nextInt();
			}
		}
		
		
		int winner = Check(board);
		if(winner!=0){
			System.out.println("Winner is: User "+winner);
		}
		else{
			System.out.println("No Winner");
		}
	}

	
	
	public static int Check(int[][] board){
		int winner = 0;
		int count1 =0;
		int count2 =0;
		for(int i=0; i<3; i++){
			count1=0;
			count2=0;
			for(int j=0; j<3; j++){
				if(board[i][j]==1)
					count1++;
				if(board[i][j]==2)
					count2++;
			}
			if(count1==3){
				winner=1;
				return winner;
				
			}
			if(count2==3){
				winner=2;
				return winner;
			}
		}
		
		
		for(int i=0; i<3; i++){
			count1=0;
			count2=0;
			for(int j=0; j<3; j++){
				if(board[j][i]==1)
					count1++;
				if(board[j][i]==2)
					count2++;
			}
			if(count1==3){
				winner=1;
				return winner;
				
			}
			if(count2==3){
				winner=2;
				return winner;
			}
		}
		count1=0;
		count2=0;
		for(int i=0; i<3; i++){
			if(board[i][i]==1)
				count1++;
			if(board[i][i]==2)
				count2++;
		}
		if(count1==3){
			winner=1;
			return winner;
			
		}
		if(count2==3){
			winner=2;
			return winner;
		}
		count1=0;
		count2=0;
		for(int i=0; i<3; i++){
			if(board[i][2-i]==1)
				count1++;
			if(board[i][2-i]==2)
				count2++;
		}
		
		if(count1==3){
			winner=1;
			return winner;
			
		}
		if(count2==3){
			winner=2;
			return winner;
		}
		return winner;
	}
}
