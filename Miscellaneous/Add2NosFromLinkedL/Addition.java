package Add2NosFromLinkedL;

import java.util.ArrayList;
import java.util.Collections;

import RemoveDuplicatesLinedList.Data;

public class Addition {
	static ArrayList<Integer> answer = new ArrayList<>();
	
	public static void main(String[] args) {
		int[] number1 = {7,0,0,5};
		int[] number2 = {5};
		int length1, length2;
		Data Head1 = new Data();
		Data Head2 = new Data();
		
		Head1 = CreatList(number1);
		Head2 = CreatList(number2);
		length1 = CountLength(Head1);
		length2 = CountLength(Head2);
		
		if(length1 > length2){
			Head2 = AddElements(length1-length2, Head2);
		}
		if(length2 > length1){
			Head1 = AddElements(length2-length1, Head1);
		}
		
		int carry = add(Head1, Head2);
		if(carry > 0)
			answer.add(carry);
		Collections.reverse(answer);
		for(int i : answer){
			System.out.println(i);
		}
		
	}

	
	public static int CountLength(Data Head){
		int length = 0;
		
		while(Head != null){
			length++;
			Head = Head.getNext();
		}
		
		return length;
	}


	public static Data CreatList (int[] array){
		Data Head = new Data();
		Data node = new Data();
		for(int i=0; i<array.length; i++){
			Data dummy = new Data();
			dummy.setKey(array[i]);
			node.setNext(dummy);
			if(i==0)
				Head = dummy;
			node = dummy;
		}
		return Head;
	}

	
	public static Data AddElements(int number, Data Head){
		
		for(int i=0; i<number; i++){
			Data dummy =  new Data();
			dummy.setKey(0);
			dummy.setNext(Head);
			Head = dummy;
		}
		
		
		return Head;
	}


	public static void print(Data Head){
		while(Head != null){
			System.out.println(Head.getKey());
			Head = Head.getNext();
		}
	}


	public static int add(Data head1, Data head2){
		if(head1 == null){
			return 0;
		}
		int i = head1.getKey();
		int j = head2.getKey();
		int k = i + j + add(head1.getNext(), head2.getNext());
		answer.add(k%10);
		return k/10;
	}
}
