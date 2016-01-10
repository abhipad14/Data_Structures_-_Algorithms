package NearestKElementsFromOrigin;

import java.util.ArrayList;
import java.util.Arrays;

public class FindNear {

	public static void main(String[] args) {
		int[] elements = {0,-1,-2,-3,-4,-5,-6,-7};
		int integer = 7;
		int min = 0, minIndex = 0;
		Arrays.sort(elements);
		for(int i=0; i<elements.length; i++){
			if(i == 0){
				min = Math.abs(elements[i]);
				minIndex = 0;
			}
			else if(Math.abs(elements[i]) < min){
				min = Math.abs(elements[i]);
				minIndex = i;
			}	
		}
		int left = minIndex - 1;
		int right = minIndex + 1;
		int counter = 1;
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(elements[minIndex]);
		while(counter < integer){
			if(left<0  ||  right > elements.length-1)
				break;
			else{
				if(Math.abs(elements[right])<Math.abs(elements[left])){
					answer.add(elements[right]);
					right++;
				}
				else if(Math.abs(elements[right])>Math.abs(elements[left])){
					answer.add(elements[left]);
					left--;
				}
				else{
					if(counter < integer-1){
						answer.add(elements[right]);
						answer.add(elements[left]);
						right++;
						left--;
						counter++;
					}
					else{
						answer.add(elements[right]);
					}
						
				}
				counter++;
			}
		}
		if(counter < integer){
			if(right > elements.length-1){
				while(counter < integer){
					answer.add(elements[left]);
					left--;
					counter++;
				}
			}
			if(left<0){
				while(counter < integer){
					answer.add(elements[right]);
					right++;
					counter++;
				}
			}
		}
		//System.out.println(answer.size());
		for(int i : answer){
			System.out.println(i);
		}
	}
}
