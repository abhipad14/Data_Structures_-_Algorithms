package HieghtOfBinaryTree;

import CheckIfTheTreeIsBalanced.Node;

public class Height {

	public static void main(String[] args) {
		int[] data = {14,5,17,2,10,1,4,3,8,12,7,9,6,11,13,16,20,15,18,22,19,21,23,24,25,26,27};
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
		 
		 
		 
		 /**********************MAIN CODE******************************/
		 int height = GetHeight(root, 0);
		 System.out.println(height-1);
		 
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
