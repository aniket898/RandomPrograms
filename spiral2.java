package try1;

import java.util.ArrayList;
import java.util.List;

public class spiral2 {
	public static void main(String args[]){
		List<ArrayList<Integer>> finalList =  generateMatrix(3);
		System.out.println(finalList);
	}
	public static ArrayList<ArrayList<Integer>> generateMatrix(int A) {
		List<ArrayList<Integer>> finalList = new ArrayList<ArrayList<Integer>>();
		if(A==0){
        	return null;
        }
		
		int[][] finalMatrix = new int[A][A];
		int row1=0,row2=A-1;
		int column1=0,column2=A-1;
		int count = 1;
		
		while(count<=(A*A)){	 
			 for(int i=column1;i<=column2;i++)
             {
				 finalMatrix[row1][i]=count;
				 count++;
             }
             for(int i=row1+1;i<=row2;i++)
             {
            	 finalMatrix[i][column2]=count;
				 count++;
             }
             for(int i=column2-1;i>=column1;i--)
             {
            	 finalMatrix[row2][i]=count;
				 count++;
             }
             for(int i=row2-1;i>=row1+1;i--)
             {
            	 finalMatrix[i][column1]=count;
				 count++;
             }
             row1++;
             row2--;
             column1++;
             column2--;
		}
		
		for(int i=0;i<A;i++){
	    	List<Integer> temp = new ArrayList<Integer>();
	        for(int j=0;j<A;j++){
	        	temp.add(finalMatrix[i][j]);
	        }
	        finalList.add((ArrayList<Integer>) temp);
	    }
		
		return (ArrayList<ArrayList<Integer>>) finalList;
		
	}
}
