package SortingLinkedList;

import RemoveDuplicatesLinedList.Data;

public class Sorting {

	public static void main(String[] args) {
		int[] keys = {4,6,2,7,5,3,1};
		int counter = 1;
		int counter2 = 1;
		Data node = new Data();
		Data Head = new Data();
		Data next = new Data();
		Data connection =  new Data();
		connection = null;
		Data current = new Data();
		for(int i=0; i<keys.length; i++){
			Data dummy = new Data();
			dummy.setKey(keys[i]);
			node.setNext(dummy);
			if(i==0)
				Head = dummy;
			node = dummy;
		}
		
		int value = 6;
		next = Head;
		while(next != null){
			Data dummy = new Data();
			dummy.setKey(next.getKey());
			dummy.setNext(null);
			if(next.getKey() <= value){
				if(counter == 1){
					Head = dummy;
					node = dummy;
					counter++;
				}
				else{
					node.setNext(dummy);
					node = dummy;
				}
			}
			else{
				if(counter2 == 1){
					connection = dummy;
					current = dummy;
					counter2++;
				}
				else{
					current.setNext(dummy);
					current = dummy;
				}
			}
			
			
			next = next.getNext();
		}
		
		if(counter == 1)
			Head = connection;
		else{
			node.setNext(connection);
		}
		print(Head);

	}
	
	
	public static void print(Data node){
		while(node != null){
			System.out.println(node.getKey());
			node = node.getNext();
		}
	}
}
