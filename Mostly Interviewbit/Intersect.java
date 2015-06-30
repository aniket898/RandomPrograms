package try1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Intersect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(3);
		A.add(3);
		A.add(4);
		A.add(5);
		A.add(6);
		ArrayList<Integer> B = new ArrayList<Integer>();
		B.add(3);
		B.add(5);
		B.add(3);
		ArrayList<Integer> C = intersect(A, B);
		for(Integer i:C){
			System.out.println(i);
		}
	}
	
	public static ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		if(A==null || B==null || A.size()==0 || B.size()==0)
			return temp;
		Map<Integer,Integer> C = new HashMap<Integer,Integer>();
		Collections.sort(A);
		Collections.sort(B);
		
		for(Integer i:A){
			if(!C.containsKey(i))
				C.put(i, 1);
			else
				C.put(i, C.get(i)+1);
		}
		for(Integer i:B){
			if(C.containsKey(i)){
				temp.add(i);
				if(C.get(i)==1)
					C.remove(i);
				else
					C.put(i, C.get(i)-1);
			}
		}
		
		return temp;
	}

}
