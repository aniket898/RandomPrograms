package try1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class largestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> temp = new ArrayList<Integer>();
		temp.add(0);
		temp.add(0);
		temp.add(0);
		temp.add(0);
		//temp.add(9);
		String temp2 = largestNumber(temp);
		System.out.println(temp2);
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

}
