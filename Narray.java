package try1;

import java.util.ArrayList;
import java.util.List;

public class Narray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List A = new ArrayList<Long>();
		A.add(1);
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(5);
		ArrayList<Integer> B = repeatedNumber(A);
		for(int j=0;j<B.size();j++){
			System.out.println("\n"+B.get(j));
		}
	}

	/*public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
		int maxNumber=0;
		List B = new ArrayList<Integer>();
		for(int i =0;i<A.size();i++){
			if(maxNumber<A.get(i)){
				maxNumber = A.get(i);
			}
			
			if(A.contains(-A.get(i))){
				B.add(A.get(i));
			} else {
				A.set(i, -A.get(i));
			}
		}
		for(int i = 1;i<=maxNumber;i++){
			if(!A.contains(-i)){
				B.add(i);
			}
		}
		
		return (ArrayList<Integer>) B;
	    
	}*/
	
	public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
		 
			List B = new ArrayList<Integer>();
			Integer[] Arr = new Integer[A.size()];
			Arr = A.toArray(Arr);
			int tempNum;
			for(int i=0;i<Arr.length;i++){
				tempNum = Math.abs(Arr[i]);
				if(Arr[tempNum-1]<0){
					B.add(tempNum);
				} else {
					Arr[tempNum-1] = -Arr[tempNum-1];
				}
			}
			for(int i=0;i<Arr.length;i++){
				if(Arr[i]>0)
					B.add(i+1);
			}
			
			return (ArrayList<Integer>) B;
	    
	}
}
