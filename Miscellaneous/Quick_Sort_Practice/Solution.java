package Quick_Sort_Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		File name = new File("src/Quick_Sort_Practice/Input.txt");
		Scanner scanf=null;
		try {
			scanf = new Scanner(name);
			while(scanf.hasNext()){
				ArrayList<Integer> a = new ArrayList<>();
				boolean flag = true;
				while(scanf.hasNext()){
					String limiter = scanf.next();
					int len = limiter.length();
					if(limiter.charAt(len-1)!=','){
						int value = Integer.parseInt(limiter);
						a.add(value);
					}
					else{
						flag = false;
						int value = Integer.parseInt(limiter.substring(0, len-1));
						a.add(value);
						Integer[] b = new Integer[a.size()];
						a.toArray(b);
						int end = a.size();
						QuickSort(b, 0, end-1);
						System.out.println(Arrays.toString(b));
						break;
					}
				}
				if(flag){
					Integer[] b = new Integer[a.size()];
					a.toArray(b);
					int end = a.size();
					QuickSort(b, 0, end-1);
					System.out.println(Arrays.toString(b));
				}
				
			}
			
		}
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		

	}

	
	
	public static void QuickSort(Integer[] a, int s, int e){
		if(s<e){
			int mid = Partition(a, s, e);
			QuickSort(a, s, mid);
			QuickSort(a, mid+1, e);
		}
		
	}


	public static int Partition(Integer[] a, int s, int e){
		int random =  (s+(int)(Math.random()*(e-s+1)));
		int pivot = a[random];
		int mid = s;
		int start = s;
		int end = e;
		while(s<e){
			while(s<=end  &&  a[s]<=pivot){
				s++;
			}
			while(e>=start  &&  a[e]>pivot){
				e--;
			}
			if(s<e){
				Swap(a, s, e);
			}
			
		}
		mid  = s-1;
		return mid;
		
		
	}


	public static void Swap(Integer[] a, int s, int e){
		int temp = a[s];
		a[s] = a[e];
		a[e] = temp;
	}
}
