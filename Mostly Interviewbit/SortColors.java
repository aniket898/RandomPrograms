package try1;

import java.util.ArrayList;

public class SortColors {
	public static void main(String[] args) {
		ArrayList<Integer> temp= new ArrayList<Integer>();
	
	}
	public static void sortColors(ArrayList<Integer> A) {
		   int[] count = new int[3];   
		   for (int color : A) 
			   count[color]++;   
		   A.clear();
		   int i = 0;   
		   for (; i < count[0]; i++) A.add(i,0);   
		   for (; i < count[1]; i++) A.add(i,1);   
		   for (; i < A.size(); i++) A.add(i,2);   
	}
}
