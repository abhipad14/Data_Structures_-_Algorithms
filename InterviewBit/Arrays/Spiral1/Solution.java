public class Solution {
	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		 int m = a.size();
			int n = a.get(0).size();
			int top = 0, bottom = m, left=0, right = n;
			while(top<bottom && left<right){
				int i=0,j=0,k=0;
				for(i=left; i<right; i++){
					result.add(a.get(top).get(i));
				}
				top++;
				i--;
				for(j= top; j<bottom; j++){
					int temp = a.get(j).get(i);
					result.add(temp);
					
				}
				right--;
				j--;
				if(top<bottom){
					for(k=right-1; k>=left; k--){
						int temp = a.get(j).get(k);
						result.add(temp);
						
					}
					bottom--;
					k++;
				}
				
				if(left<right){
					for(int l=bottom-1; l>=top; l--){
						int temp = a.get(l).get(k);
						result.add(temp);
						
					}
					left++;
				}
			}
		 return result;
	}
}