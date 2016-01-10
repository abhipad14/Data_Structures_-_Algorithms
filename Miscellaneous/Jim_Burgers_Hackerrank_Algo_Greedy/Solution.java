package Jim_Burgers_Hackerrank_Algo_Greedy;

import java.util.Arrays;
import java.util.Scanner;

import Citrix_Test.OpGearCost.RadCos;

public class Solution {
	public class Node implements Comparable<Node> {
		int time;
		int costumer;

		@Override
		public int compareTo(Node a) {
			if(time - a.time >0){
				return 1;
			}
			else if(time - a.time < 0){
				return -1;
			}
			else if(time - a.time==0){
				if(costumer < a.costumer)
					return -1;
				else if(costumer > a.costumer){
					return 1;
				}
				else
					return 0;
			}
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		Node[] a = new Node[n];
		for(int i=1; i<=n; i++){
			int one = scanf.nextInt();
			int two = scanf.nextInt();
			Solution dum = new Solution();
			Node dummy = dum.new Node();
			dummy.time = one+two;
			dummy.costumer = i;
			a[i-1] = dummy;
		}
		Arrays.sort(a);
		for(int i=0; i<n; i++){
			System.out.print(a[i].costumer+" ");
		}

	}

}
