package try1;

public class SquareGridRobot {
	public static void main(String args[]){
		int noPaths = uniquePaths(7,3);
		System.out.println(noPaths);
	}
	public static int uniquePaths(int A, int B) {
		int noPaths=0;
		if(A==1 || B==1){
			return 1;
		} else if(A==0 || B==0){
		    return 1;
		}
		//noPaths = backtrack(0, 0, A, B);
		int[][] matrix=new int[A][B];
        for (int i=0; i<A; i++){
            matrix[i][0]=1;
        }
        for (int i=0; i<B; i++){
            matrix[0][i]=1;
        }
        for (int i=1; i<A; i++){
            for (int j=1; j<B; j++){
                matrix[i][j]=matrix[i-1][j]+matrix[i][j-1];        
            }
        }   
        return matrix[A-1][B-1];
	}
	
	/*public static int backtrack(int row, int column, int A, int B) {
		  if (row==A && column==B){
		    return 1; 
		  } else if (row>A || column>B) {  
			  return 0;
		  }	  
		  return backtrack(row+1,column,A,B) + backtrack(row,column+1,A,B);
	}*/
}
