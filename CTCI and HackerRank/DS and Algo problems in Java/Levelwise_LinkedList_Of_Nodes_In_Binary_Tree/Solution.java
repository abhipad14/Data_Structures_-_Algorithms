package Levelwise_LinkedList_Of_Nodes_In_Binary_Tree;

import java.util.ArrayList;

import CheckIfTheTreeIsBalanced.Node;

public class Solution {

	static ArrayList<Data> arrHead = new ArrayList<>();
	static ArrayList<Data> arrLast = new ArrayList<>();
	static ArrayList<ArrayList<Integer>> numbers = new ArrayList<>();
	
	public static void main(String[] args) {
		 int[] data = {10,11,12,13,14,15,16,17};
		 Node root = new Node();
		 Node temp = new Node();
		 root = null;
		 temp = root;
		 
		 for(int i=0; i<data.length; i++){
			 if(root == null){
				 Node dummy = new Node(data[i], null, null);
				 root = dummy;
				 temp = root;
			 }
			 else{
				 temp = root;
				 while(true){
					 if(data[i] < temp.getData()){
						 if(temp.getLeft() == null){
							 temp.setLeft(new Node(data[i], null, null));
							 break;
						 }
						 else{
							 temp = temp.getLeft();
						 }
					 }
					 else{
						 if(temp.getRight() == null){
							 temp.setRight(new Node(data[i], null, null));
							 break;
						 }
						 else{
							 temp = temp.getRight();
						 }
					 }
				 }
			 } 
		 }
		 
		 
		 //************Write Main Code From Here****************//
		 CreateList(root, 0);
		 
		 for(ArrayList<Integer> i : numbers){
			 for(Integer j: i){
				 System.out.print(j+"-->");
			 }
			 System.out.println();
		 } 
	}

	
	
	public static void  CreateList(Node root, int level){
		if(root!=null){
			level++;
			Create(root, level);
			CreateList(root.getLeft(), level);
			CreateList(root.getRight(), level);
		}
	}


	
	public static void Create(Node root, int level){
		try{
			numbers.get(level-1).add(root.getData());
			
		}
		catch (Exception e){
			ArrayList<Integer> dummy = new ArrayList<>();
			dummy.add(root.getData());
			numbers.add(level-1, dummy);
		}
	}
}
