package Practice;

public class Distance {

	public static void main(String[] args) {
		int[] A = {2,4,6,15,17,3,1,9,10,8,7,5,4,3,14,12,20,19,18};
		int X = 20;
		int D = 4;
		
		System.out.println(solution(A, X, D));

	}

	
	
	public static int solution(int[] A, int X, int D){
		int time = -1;
		boolean[] check = new boolean[X];
		boolean flag = false;
		int position =0;
		int counter = 0;
		if(X==0 || D>=X) return 0;
		if(D==0) return -1;
		
		for(int i=0; i<check.length; i++)
			check[i] = false;
		
		for(int i=0; i<A.length; i++){
			if(!check[A[i]-1]){
				check[A[i]-1] = true;
				if(A[i]<=position+D  && A[i]>position){
					position = A[i];
					time = i;
					if(flag){
						int j = position;
						counter = 0;
						while(true){
							if(check[j]){
								position = j+1;
								counter = -1;
							}
							j++;
							counter++;
							if(counter == D || position>= X-D){ 
								break;
							}
						}
					}
				}
				else if(A[i]>position+D){
					flag = true;
				}
				if(position>= X-D) break;
			}
		}
		
		if(position < X-D) time = -1;
		return time;
	}
}
