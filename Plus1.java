package try1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Plus1 {

	public static void main(String args[]){
		List<Integer> A = new ArrayList<Integer>();
		A.add(9);
		A.add(9);
		A.add(9);
		A.add(9);
		A.add(9);
		A.add(9);
		A.add(9);
		A.add(9);
		A.add(9);
		A.add(9);
		A.add(9);
		A.add(9);
		
		plusOne(A);
	}
	
	public static ArrayList<Integer> plusOne1(List<Integer> A) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		String sb = "";
		for(int i=0;i<A.size();i++){
			sb = sb + String.valueOf(A.get(i));
		}
		long num = Long.parseLong(sb);
		num += 1;
		while(num > 0){
			result.add((int) (num%10));
			num/=10;
		}
		Collections.reverse(result);
		return result;
		
	}
	
	public static ArrayList<Integer> plusOne(List<Integer> A) {
		int carry = 0;
		if(A.size()==0){
			return (ArrayList<Integer>) A;
		} else {
			if(A.size()==1 && A.get(0)==0){
				A.set(A.size()-1,1);
				return (ArrayList<Integer>) A;
			} else {
				while(A.get(0)==0){
					A.remove(0);
				}
				if(A.get(A.size()-1)==9){
					A.set(A.size()-1, 0);
					carry=1;
				} else {
					A.set(A.size()-1, A.get(A.size()-1)+1);
					carry=0;
				}
				for(int i = A.size()-2;i>=0;i--){
					if(A.get(i)==9 && carry == 1){
						A.set(i, 0);
						carry = 1;
					} else if(carry==1) {
						A.set(i, A.get(i)+1);
						carry = 0;
					}
				}
				if(carry==1){
					A.add(1);
					Collections.reverse(A);
				}
			}
		}
		/*for(int i = 0;i<A.size();i++){
			System.out.println(A.get(i));
		}*/
		return (ArrayList<Integer>) A;
		
	}
}
