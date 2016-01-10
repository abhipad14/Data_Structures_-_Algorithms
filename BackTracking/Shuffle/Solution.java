package Card_Shuffling_Algorithim;

public class Solution {

	public static void main(String[] args) {
		String[] suite = {"Heart", "Spade", "Club", "Diamond"};
		String[] value = {"Ace", "Two", "Three", "Four", "Five","Six", "Seven",
						  "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		
		Card[] deck = new Card[52];
		int i=0;
		for(String s: suite){
			for(String v: value){
				deck[i++] = new Card(s,v);
			}
		}
		Shuffle(deck,0, 51);
		for(Card c: deck){
			System.out.print(c.value+" of "+c.suite+"\n");
		}
	}

	
	public static void Shuffle(Card[] deck,int i, int j){
		if(j>0){
			Shuffle(deck, i, j-1);
			Swap(deck, i, j-1);
		}
	}

	
	
	public static void Swap(Card[] deck, int low, int high){
		int bound = high-low+1;
		int num = low+ (int)(Math.random()*bound);
		Card temp = deck[num];
		deck[num] = deck[high+1];
		deck[high+1] = temp;
	}

}


