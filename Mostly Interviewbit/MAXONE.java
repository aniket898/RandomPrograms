package try1;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class MAXONE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A1 = { 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0 };
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		for(Integer i:A1){
			A.add(i);
		}
		/*A.add(1);
		A.add(1);
		A.add(0);
		A.add(1);
		A.add(1);
		A.add(0);
		A.add(0);
		A.add(1);
		A.add(1);
		A.add(1);*/
		/*A.add(0);
		A.add(1);
		A.add(1);
		A.add(1);*/
		int M=7;
		ArrayList<Integer> temp = maxone(A, M);
		for(Integer i:temp){
			System.out.println(i);
		}
	}

	public static ArrayList<Integer> maxone(ArrayList<Integer> A, int B) {
		 ArrayList<Integer> contOnes = new ArrayList<Integer>();
			/*int left = 0, maxLeft = 0, right = 0, maxRight = 0 ; 
			int numberZeroes = 0;
			int maxWidth = -1;
			
			while(right < A.size()-1){	
				if (numberZeroes <= B){
					right++;
					System.out.println(right + ":"+ A.get(right));
					if (A.get(right) == 0) 
						numberZeroes++; 
						
				};
	            if (numberZeroes > B || (B==0 && A.get(left)==0)){ 
					if (A.get(left) == 0) 
						numberZeroes--;
					System.out.println(left + ":"+ A.get(left));
					left++;
					System.out.println(left);
				};
				if (right - left > maxWidth && numberZeroes <= B){
					System.out.println("right : "+right+" left:"+left);
					maxWidth = right - left ;
					maxRight = right;
					maxLeft = left;
				}	
			}
			
			for(int i=maxLeft;i<=maxRight;i++){
				contOnes.add(i);
			}
			return contOnes;*/
		 
		 	int maxWidth = 0;
			int maxLeft = 0,maxRight = 0,left = 0;
			ArrayDeque<Integer> zeroLoc = new ArrayDeque<Integer>();
			for (int i = 0; i < A.size(); ++i) {
				if (A.get(i) == 0) {
					if (zeroLoc.size() < B) {
						zeroLoc.addFirst(i);
					}
					else  {
						if (i - left > maxWidth) {
							maxWidth = i - left;
							maxLeft = left;
							maxRight = i;
						}
						left = zeroLoc.removeLast() + 1;
						zeroLoc.addFirst(i);
					}
				}
			}
			if (A.size() - left > maxWidth) {
				maxLeft = left;
				maxRight = A.size();
			}	
			for (int i = maxLeft; i < maxRight; i++) {
				contOnes.add(i);
			}
			return contOnes;
	}
}
