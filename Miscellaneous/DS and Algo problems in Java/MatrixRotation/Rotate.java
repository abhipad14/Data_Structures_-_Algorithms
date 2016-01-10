package MatrixRotation;

public class Rotate {

	public static void main(String[] args) {
		int[][] matrix = {	{1,2,3,4,5},
							{6,7,8,9,10},
							{11,12,13,14,15},
							{16,17,18,19,20},
							{21,22,23,24,25},
						 };
		int counter = 0;
		int len = matrix.length;
		int maxCounter = 0;
		int n = matrix.length-1;
		int temp = 0;
		if(len % 2 ==0)
			maxCounter = len / 2;
		else
			maxCounter = (len-1)/2;
		
		len = len - 1;
		
		while(counter < maxCounter){
			for(int i = counter; i<len; i++){
				temp = matrix[counter][i];
				matrix[counter][i] = matrix[n-i][counter];
				matrix[n-i][counter] = matrix[n-counter][n-i];
				matrix[n-counter][n-i] = matrix[i][n-counter];
				matrix[i][n-counter] = temp;
			}
			len = len - 1;
			counter++;
		}
		
		for(int i=0; i<=n; i++){
			for(int j=0; j<=n; j++){
				System.out.print(matrix[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
			
				
				
	}

}
