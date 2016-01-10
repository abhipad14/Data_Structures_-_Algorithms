package Pure_Storage_Test;

import RemoveDuplicatesLinedList.Data;

public class Solution {

	public static void main(String[] args) {
		int[] number1 = {3,2,3,3,4,5,3};
		Data Head1 = new Data();
		Head1 = CreatList(number1);
		Head1=removeall(3, Head1);
		print(Head1);
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
	
	
	public static void print(Data Head){
		while(Head != null){
			System.out.println(Head.getKey());
			Head = Head.getNext();
		}
	}


	public static Data removeall(int val, Data list){
		Data pre;
		Data temp = list;
		if(temp!=null){
			if(temp.getNext()!=null){
				pre = temp;
				temp = temp.getNext();
				while(temp!=null){
					if(temp.getKey()==val){
						pre.setNext(temp.getNext());
					}
					else{
						pre = temp;
					}
					temp = temp.getNext();
				}
			}
			else{
				if(temp.getKey()==val){
					list= null;
				}
			}
			if(list.getKey()==val){
				list = list.getNext();
			}
			return list;
		}
		return list;
	}
}
