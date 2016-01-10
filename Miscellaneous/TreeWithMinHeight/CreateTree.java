package TreeWithMinHeight;

import java.util.Arrays;

public class CreateTree {

	public static void main(String[] args) {
		int[] data = {1,5,9,10,25,35,85,100};
		Arrays.sort(data);
		Node root = new Node();
		root = Create(data, data.length-1, 0);
		int height = GetHeight(root, -1);
		//System.out.println(root.getData());
		System.out.println(height);
	}

	
	public static Node Create(int[] array, int high, int low){
		Node root = new Node();
		if(high >= low){
			int mid = (high+low)/2;
			root.setData(array[mid]);
			root.setLeft(Create(array, (mid-1), low));
			root.setRight(Create(array, high, (mid+1)));
		}
		else{
			root = null;
		}
		return root;
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
