package Arrays.Arrays_Rotate2d;

import java.util.ArrayList;

public class Solution {

	public void rotate(ArrayList<ArrayList<Integer>> a) {
		int temp;
		int size = a.size();
		for(int i=0; i<size; i++){
			for(int j=i+1; j<size; j++){
				temp = a.get(i).get(j);
				a.get(i).set(j, a.get(j).get(i));
				a.get(j).set(i, temp);
			}
		}
		for(int i=0; i<size; i++){
			for(int j=0; j<size/2; j++){
				temp = a.get(i).get(j);
				a.get(i).set(j, a.get(i).get(size-1-j));
				a.get(i).set(size-1-j, temp);
			}
		}
		System.out.println("------------------");
		for(int i=0; i<size; i++){
			ArrayList<Integer> temp1 = a.get(i);
			for(int j=0; j<size; j++){
				System.out.print(temp1.get(j)+" ");
			}
			System.out.println();
		}
		
	}

}
