package RemoveDuplicatesLinedList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] keys = {1,2,3,4,5,6,7,8,9,10};
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
		Data iterate = new Data();
		iterate = mainNode.getNext();
		Data previous = new Data();
		previous = mainNode;
		boolean result;
		while (iterate != null){
			
			result = ifDuplicate(mainNode.getNext(), iterate, iterate.getKey());
			if(result){
				previous.setNext(iterate.getNext());
				iterate = iterate.getNext();
			}
			else{
				previous = iterate;
				iterate = iterate.getNext();
			}
		}
		
		while(node != null){
			System.out.println(node.getKey());
			node = node.getNext();
		}

	}
	
	public static boolean ifDuplicate(Data start, Data end, int key){
		boolean found = false;
			while(start != end){
				if(start.getKey() == key){
					found = true;
					break;
				}
				else{
					start = start.getNext();
				}
			}
		return found;
	}

}
