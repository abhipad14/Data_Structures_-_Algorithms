package DeleteNodeFromSinglyLinkedList;

import RemoveDuplicatesLinedList.Data;

public class DeleteNode {

	public static void main(String[] args) {
		int[] keys = {1,2,3,4,5,6,7,8,9,10,11};
		Data node = new Data();
		Data mainNode = new Data();
		for(int i=0; i<keys.length; i++){
			Data dummy = new Data();
			dummy.setKey(keys[i]);
			node.setNext(dummy);
			if(i==0)
				mainNode.setNext(dummy);
			node = dummy;
		}
		node = mainNode.getNext();
		
		
		Data givenNode = new Data();
		givenNode = node.getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext();
		
		
		if(givenNode.getNext() != null){
			givenNode.setKey(givenNode.getNext().getKey());
			givenNode.setNext(givenNode.getNext().getNext());
		}	
		else{
			givenNode = null;
		}
		
		while(node !=  null){
			System.out.println(node.getKey());
			node = node.getNext();
		}

	}

}
