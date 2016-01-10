package MatrixWithZero;

public class Zero {

	public static void main(String[] args) {
		int[][] matrix = {
							{0,2,3,1,4},
							{5,0,1,7,8},
							{9,10,0,12,13},
							{14,1,15,0,17},
						 };
		int row = matrix.length;
		int column = matrix[0].length;
		int[] I = new int [row];
		int[] J = new int [column];
		
		for(int i=0; i<row; i++){
			for(int j=0; j<column; j++){
				if(matrix[i][j]==0){
					I[i] = 1;
					J[j] = 1;
				}
			}
		}
		
		for(int i=0; i<row; i++){
			for(int j=0; j<column; j++){
				if(I[i]==1  || J[j]==1)
					matrix[i][j] = 0;
			}
		}
		
		for(int i=0; i<row; i++){
			for(int j=0; j<column; j++){
				System.out.print(matrix[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
