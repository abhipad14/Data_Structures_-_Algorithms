package Hashing.Fraction;

import java.util.HashMap;

public class Solution {
	public String fractionToDecimal(int numerator, int denominator) {
		long n=numerator,d=denominator;
        if(n%d==0) return String.valueOf(n/d);
        HashMap<Long,Integer> map=new HashMap<>();
        StringBuilder answer=new StringBuilder();
        if((n>0&&d<0)||(n<0&&d>0)) answer.append("-");
        n=Math.abs(n);
        d=Math.abs(d);
        answer.append(n/d+".");
        n=(n%d)*10;
        while(!map.containsKey(n)){
            map.put(n,answer.length());
            answer.append(String.valueOf(n/d));
            n=(n%d)*10;
            if(n==0) return answer.toString();
        }
        return answer.insert(map.get(n),"(").append(")").toString();
	}
}
