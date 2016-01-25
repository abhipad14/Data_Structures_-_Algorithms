package TwoPointer.Threesum;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public int threeSumClosest(ArrayList<Integer> a, int b) {
		int low, high, mid;
		Collections.sort(a);
		int n = a.size();
		int res = a.get(0) + a.get(1) + a.get(2);
		if (n == 3) {
			return res;
		}
		int sum;
		for (low = 0; low < n - 2; low++) {
			mid = low + 1;
			high = n - 1;
			int num = b - a.get(low);
			while (mid < high) { 
				sum = a.get(mid) + a.get(high);
				if (sum == num)
					return b;
				else if (sum < num) {
					mid++;
				} else {
					high--;
				}
				int diff = Math.abs(sum - num);
				int otherDiff = Math.abs(res - b);
				if (diff < otherDiff)
					res = sum + a.get(low);
			}
		}
		return res;
	}
}
