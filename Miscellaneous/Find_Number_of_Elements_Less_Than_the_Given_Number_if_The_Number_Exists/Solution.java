package Find_Number_of_Elements_Less_Than_the_Given_Number_if_The_Number_Exists;

import java.util.Scanner;

public class Solution {

	static Node root;
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		root = null;
		for(int i=0; i<n; i++){
			int a = scanf.nextInt();
			if(root==null){
				Node dummy = new Node();
				dummy.data = a;
				dummy.left = null;
				dummy.right = null;
				dummy.rank = 0;
				root = dummy;
			}
			else{
				insert(root, a);
			}
			
		}
		int a = scanf.nextInt();
		int rank = findRank(root, a);
		if(rank == -1){
			System.out.println("Not Found");
		}
		else{
			System.out.println(rank);
		}
	}

	
	
	public static void insert(Node root, int key){
		
		if(root!=null){
			if(key < root.data){
				root.rank++;
				if(root.left==null){
					Node dummy = new Node();
					dummy.data = key;
					dummy.left = null;
					dummy.right = null;
					dummy.rank = 0;
					root.left = dummy;
				}
				else{
					insert(root.left, key);
				}
			}
			else{
				if(root.right==null){
					Node dummy = new Node();
					dummy.data = key;
					dummy.left = null;
					dummy.right = null;
					dummy.rank = 0;
					root.right=dummy;
				}
				else{
					insert(root.right, key);
				}
			}
		}
	}

	
	
	public static int findRank(Node root, int key){
		if(root==null){
			return -1;
		}
		else if(root.data == key){
			return root.rank;
		}
		else{
			if(root.data < key){
				int a = findRank(root.right, key);
				if(a==-1)
					return -1;
				else
					return ((root.rank)+1+(a));
			}
			else{
				return findRank(root.left, key);
			}
		}
	}
	
	
	
}
