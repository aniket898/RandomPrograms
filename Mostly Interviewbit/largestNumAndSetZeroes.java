package try1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class largestNumAndSetZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> temp = new ArrayList<Integer>();
		temp.add(0);
		temp.add(0);
		temp.add(0);
		temp.add(0);
		//temp.add(9);
		//String temp2 = largestNumber(temp);
		//System.out.println(temp2);
		Scanner in = new Scanner(System.in);
		int m =3,n=3;
		List<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<m;i++){
			ArrayList<Integer>  matrixBuilder= new ArrayList<Integer>();
			for(int j=0;j<n;j++){
				matrixBuilder.add(in.nextInt());
			}
			matrix.add(matrixBuilder);
		}
		setZeroes((ArrayList<ArrayList<Integer>>) matrix);	
		
	}
	
	public static String largestNumber(final List<Integer> A) {
		boolean zeroFlag=true;
		StringBuilder temp= new StringBuilder();
		Comparator<Integer> cmp = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				//System.out.println("hello");
				String appendFirst = "" +o1+o2;
				String appendSecond = "" +o2+o1;
				return -1 * appendFirst.compareTo(appendSecond);
			}
			
		}; 
		
		Collections.sort(A, cmp);
		for(int i : A){
			if(i!=0)
				zeroFlag=false;
			temp.append(i);
		}
		if(zeroFlag)
			temp= new StringBuilder("0");
		return temp.toString();
	    
	}
	public static void setZeroes(ArrayList<ArrayList<Integer>> A) {
		Set<Integer> rows = new HashSet<Integer>();
		Set<Integer> columns = new HashSet<Integer>();
		int rowSize = A.size();
		int columnSize = A.get(0).size();
		
		int[][] matrix = new int[rowSize][columnSize];
		//System.out.println(A.size()+"  "+A.get(0).size());
		int i=0;
		int j=0;
		for(ArrayList<Integer> temp:A){
			j=0;
			for(Integer integer:temp){
				if(integer == 0){
					rows.add(i);
					columns.add(j);
				}
				matrix[i][j]=integer;
				j++;
			}
			i++;
		}
		
		for(int k=0;k<rowSize;k++){
			if(rows.contains(k)){
				for(int l=0;l<columnSize;l++){
					matrix[k][l]=0;
				}
			}
		}	
		for(int l=0;l<columnSize;l++){
			if(columns.contains(l)){
				for(int k=0;k<rowSize;k++){
					matrix[k][l]=0;
				}
			}
		}
		
		
			
		//A.toArray()
		/*for(i=0;i<A.size();i++){
			
			for(j=0;j<A.get(0).size();j++){
				System.out.print(" "+matrix[i][j]);
			}
			System.out.println();
		}*/
		A.clear();
		for(i=0;i<rowSize;i++){
			ArrayList<Integer> temp2 = new ArrayList<Integer>();
			for(j=0;j<columnSize;j++){
				temp2.add(matrix[i][j]);
			}
			A.add(temp2);
		}
		
				
	}
}
