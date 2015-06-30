package try1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class remduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.add(1);
		temp.add(1);
		temp.add(2);
		temp.add(5);
		temp.add(5);
		temp.add(5);
		temp.add(5);
		
		int length = removeDuplicates(temp);
		//System.out.println(length);
	}
	
	public static int removeDuplicates(ArrayList<Integer> A) {
		//int originalLength = A.size();
		int newLength = 0;
		Set<Integer> B = new HashSet<Integer>();
		for(Integer i:A){
			if(!B.contains(i))
				B.add(i);
		}
		
		newLength = B.size();
		A.clear();
		long count=0;
		for(Integer i:B){
			A.add((int) count, i);
			count++;
		}
		/*
		count--;
		for(int j=count;j<originalLength;j++){
			A.add(j, null);
		}
		
		for(Integer i:A)
			System.out.println(i);
		*/
		return newLength;
	}

}
