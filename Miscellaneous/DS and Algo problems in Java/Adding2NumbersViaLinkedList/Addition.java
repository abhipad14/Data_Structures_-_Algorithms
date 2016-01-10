package Adding2NumbersViaLinkedList;

import RemoveDuplicatesLinedList.Data;

public class Addition {

	public static void main(String[] args) {
		int[] number1 = {9,9,9};
		int[] number2 = {9,1,2};
		int carry = 0;
		int counter = 1;
		Data Head1 = new Data();
		Data Head2 = new Data();
		Data Answer = new Data();
		Data iterator1 = new Data();
		Data iterator2 = new Data();
		Data next = new Data();
		
		Head1 = CreatList(number1);
		Head2 = CreatList(number2);
		iterator1 = Head1;
		iterator2 = Head2;
		while(iterator1 != null  ||  iterator2 != null){
			Data dummy = new Data();
			
			int i, j;
			if(iterator1 != null)
				i = iterator1.getKey();
			else
				i = 0;
			 if(iterator2 != null)
				 j = iterator2.getKey();
			 else
				 j = 0;
			 
			int k = i+j+carry;
			if(k >= 10){
				carry = k/10;
				dummy.setKey(k%10);
			}
			else{
				carry = 0;
				dummy.setKey(k);
			}
			if(counter == 1){
				Answer = dummy;
				next = dummy;
				counter++;
			}
			else{
				next.setNext(dummy);
				next = dummy;
			}
			
			if(iterator1 != null)
				iterator1 =  iterator1.getNext();
			if(iterator2 != null)
				iterator2 = iterator2.getNext();
				
		}
		if(carry != 0){
			Data dummy = new Data();
			dummy.setKey(carry);
			dummy.setNext(null);
			next.setNext(dummy);
		}
		
		print(Answer);
		
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


	public static void print(Data next){
		while(next != null){
			System.out.println(next.getKey());
			next = next.getNext();
		}
	}
}
