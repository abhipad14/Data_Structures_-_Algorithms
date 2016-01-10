package Swap_2_Numbers_Inplace;

public class Solution {

	public static void main(String[] args) {
		int a = -15;
		int b = -10;
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
