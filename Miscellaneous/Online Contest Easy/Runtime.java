package Pure_Storage_Test;

public class Runtime {

	public static void main(String[] args) {
		int[] arr = {10,15,20,25,30,31,32,33,34,35};
		
		for(int i=0; i<arr.length; i++){
			long start = System.currentTimeMillis();
			f(arr[i]);
			long stop = System.currentTimeMillis();
			 
			System.out.println(stop-start);
		}
		
	}
	
	
	public static long f(int x){
		if(x<2) 
			return 1;
		else
			return f(x-1)+g(x);
	}
	
	
	
	public static long g(int x){
		if(x<2) 
			return 1;
		else
			return f(x-1)+g(x/2);
	}

}
