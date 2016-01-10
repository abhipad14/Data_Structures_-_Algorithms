package Sort_Array_of_String_So_That_All_Anagrams_Are_Together;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		String[] a = new String[n];
		
		for(int i=0; i<n; i++){
			a[i] = scanf.next();
			
		}
		
		SortString(a);
		for(String s:a){
			System.out.println(s);
		}

	}

	
	
	public static void SortString(String[] a){
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		
		for(String s: a){
			char[] arr = s.toCharArray();
			Arrays.sort(arr);
			String ss = new String(arr);
			//System.out.println();
			if(map.containsKey(ss)){
				map.get(ss).add(s);
			}
			else{
				ArrayList<String> dummy = new ArrayList<>();
				dummy.add(s);
				map.put(ss, dummy);
			}
		}
		
		Set<String> keys = map.keySet();
		int i =0;
		for(String s:keys){
			ArrayList<String> dummy = map.get(s);
			for(String s1:dummy){
				a[i] = s1;
				i++;
			}
		}
	}
}
