package Height_Of_Tree_In_GivenRange;

import java.util.ArrayList;

import CheckIfTheTreeIsBalanced.Node;


public class FindHeight {

	static ArrayList<Integer> height = new ArrayList<>();
	static int count;
	
	public static void main(String[] args) {
		int[] data = {14,5,17,2,10,1,4,3,8,12,7,9,6,11,13,16,20,15,18,22,19,21,23,24,25,26,27};
		 Node root = new Node();
		 Node temp = new Node();
		 root = null;
		 temp = root;
		 count = 0;
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
		 //System.out.println(IsInRange(root, 6, 13));
		 
		 IsInRange(root, 10, 14);
		 
		 if(!height.isEmpty()){
			 int length = 0;
			 for(int i : height){
				//System.out.println(i);
				if(i >= length ){
					 length = i;
				 }
			 }
			 
			 //System.out.println("----------------------");
			 System.out.println("height:"+(length-1)+ "     Count:"+count);
		 }
		 else{
			 System.out.println("No Sub-Tree in Given Range");
		 }
		 

	}

	
	public static boolean IsInRange(Node root, int lower, int higher){
		boolean InRange = false;
		if(root == null)
			return false;
		if(root.getData() <= higher  &&   root.getData() >= lower){
			if(root.getLeft() == null  &&  root.getRight() == null){
				InRange = true;
			}
			else if(root.getLeft() == null){
				InRange = IsInRange(root.getRight(), lower, higher);
			}
			else if(root.getRight() == null){
				InRange = IsInRange(root.getLeft(), lower, higher);
			}
			else{
				boolean left = IsInRange(root.getLeft(), lower, higher);
				boolean right = IsInRange(root.getRight(), lower, higher);
				InRange = (  left && right );
			}
			if(InRange){
				count++;
				height.add(GetHeight(root, 0));
			}
		}
		else if(root.getData() > higher){
			InRange = (IsInRange(root.getLeft(), lower, higher)  &&  false);
		}
		else if(root.getData() < lower){
			InRange = (IsInRange(root.getRight(), lower, higher) && false);
		}
		else{
			return false;
		}
		
		return InRange;
	}


	public static int GetHeight(Node root, int height){
		if(root != null){
			height++;
			return Math.max(GetHeight(root.getLeft(), height), GetHeight(root.getRight(), height));
		}
		else
			return height;
	}
}
