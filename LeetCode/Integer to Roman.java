/*
Given an integer, convert it to a roman numeral.

Input is guaranteed to be within the range from 1 to 3999.
*/


public class Solution {
    public String intToRoman(int num) {
        StringBuffer roman = new StringBuffer();
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1000, "M");
		map.put(900, "CM");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(100, "C");
		map.put(90, "XC");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(9, "IX");
		map.put(5,"V");
		map.put(4, "IV");
		map.put(1, "I");
		int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		for(int i:nums){
			while(num>=i){
				roman.append(map.get(i));
				num -= i;
			}
		}
		
		return roman.toString();
    }
}