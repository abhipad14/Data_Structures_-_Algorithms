package Minimum_Coin_For_Given_Amount;

public class MinCoin {

	public static void main(String[] args) {
		int amount = 100;
		int[] coins = {1,3,5,100};
		int[] min = new int[amount];
		
		for(int i=0; i<amount; i++){
			min[i] = -1;
		}

		
		System.out.println(GetMinCoin(amount, coins, min));
	}

	
	
	public static int GetMinCoin(int amount, int[] coins, int[] mins){
		if(amount>0){
			if(mins[amount-1] ==-1){
				int min = amount;
				boolean flag = false;
				for(int i=0; i<coins.length;i++){
					if(coins[i]==amount)
						flag = true;
				}
				if(!flag){
					int num;
					for(int i=0; i<coins.length;i++){
						num = 1+ GetMinCoin(amount-coins[i], coins, mins);
						if(num < min){
							min = num;
							mins[amount-1] = min;
						}
					}
				}
				else
					min = 1;
				return min;
			}
			else
				return mins[amount-1];
			
		}
		else{
			return 0;
		}
	}
}
