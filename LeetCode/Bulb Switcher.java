/*
There are n bulbs that are initially off. You first turn on all the bulbs. Then, you turn off every second bulb. On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on). For the nth round, you only toggle the last bulb. Find how many bulbs are on after n rounds.

Example:

Given n = 3. 

At first, the three bulbs are [off, off, off].
After first round, the three bulbs are [on, on, on].
After second round, the three bulbs are [on, off, on].
After third round, the three bulbs are [on, off, off]. 

So you should return 1, because there is only one bulb is on.
*/

public class Solution {
	public int bulbSwitch(int n) {
        int answer = 0;
        int[] bulbs = new int[n];
        for(int i=1; i<=n; i++){
        	for(int j=i-1; j<n; j += i){
        		if((j+1)%i==0){
        			bulbs[j] = bulbs[j]==0? 1 : 0;
        		}
        	}
        }
        for(int i=0; i<n; i++){
        	if(bulbs[i]==1){
        		answer++;
        	}
        }
        return answer;
    }
	
	
	public int bulbSwitchefficient(int n){
		if(n<=0) return 0;
		return (int) Math.sqrt(n);
	}
}