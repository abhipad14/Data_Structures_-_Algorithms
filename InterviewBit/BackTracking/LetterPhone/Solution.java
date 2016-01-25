package BackTracking.LetterPhone;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
	public ArrayList<String> letterCombinations(String a) {
		ArrayList<String> answer = new ArrayList<>();
		HashMap<Character, ArrayList<Character>> pad = new HashMap<>();
		ArrayList<Character> one = new ArrayList<>();
		one.add('1');
		pad.put('1', one );
		
		ArrayList<Character> two = new ArrayList<>();
		two.add('a');
		two.add('b');
		two.add('c');
		pad.put('2', two );
		
		ArrayList<Character> three = new ArrayList<>();
		three.add('d');
		three.add('e');
		three.add('f');
		pad.put('3', three );
		
		
		ArrayList<Character> four = new ArrayList<>();
		four.add('g');
		four.add('h');
		four.add('i');
		pad.put('4', four);
		
		ArrayList<Character>  five = new ArrayList<>();
		five.add('j');
		five.add('k');
		five.add('l');
		pad.put('5', five );
		
		ArrayList<Character> six = new ArrayList<>();
		six.add('m');
		six.add('n');
		six.add('o');
		pad.put('6', six );
		
		ArrayList<Character> seven = new ArrayList<>();
		seven.add('p');
		seven.add('q');
		seven.add('r');
		seven.add('s');
		pad.put('7', seven );
		
		ArrayList<Character> eight = new ArrayList<>();
		eight.add('t');
		eight.add('u');
		eight.add('v');
		pad.put('8', eight );
		
		
		ArrayList<Character> nine = new ArrayList<>();
		nine.add('w');
		nine.add('x');
		nine.add('y');
		nine.add('z');
		pad.put('9', nine );
		
		ArrayList<Character> zero = new ArrayList<>();
		zero.add('0');
		pad.put('0', zero);
		
		StringBuilder temp = new StringBuilder();
		getString(answer, a, pad, temp, a.length());
		return answer;
	}
	
	
	
	public void getString(ArrayList<String> answer, String a, HashMap<Character, ArrayList<Character>> map, StringBuilder combi, int size){
		if(a.length()>=1){
			int len = a.length();
			ArrayList<Character> temp = map.get(a.charAt(0));
			for(int i=0; i<temp.size(); i++){
				StringBuilder dummy = new StringBuilder();
				dummy.append(combi.toString());
				dummy.append(temp.get(i));
				getString(answer, a.substring(1, len), map, dummy, size);
				if(dummy.length()==size){
					answer.add(dummy.toString());
				}
				
			}
			
		}
	}
}
