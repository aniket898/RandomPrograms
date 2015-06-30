package try1;

import java.util.ArrayList;

public class Merge {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		merge(A, B);
	}
	
	public static void merge(ArrayList<Integer> A, ArrayList<Integer> B) {
		/*
		 * /*if(n2==0)
		    return;
		while(n1 > 0 && n2 > 0){
	            if(A[n1-1] > B[n2-1]){
	                A[n1+n2-1] = A[n1-1];
	                n1--;
	            }else{
	                A[n1+n2-1] = B[n2-1];
	                n2--;
	            }
	        }
	 
	        while(n2 > 0){
	            A[n1+n2-1] = B[n2-1];
	            n2--;
	        }
	        
	        ///////////////2nd solution
	        if(n2==0)
		    return;
	        int index = n1 + n2;
            while (n1 > 0 && n2 > 0) {
                if (A[n1 - 1] > B[n2 - 1]) {
                    A[--index] = A[--n1];
                } else {
                    A[--index] = B[--n2];
                }
            }
        
        while (n2 > 0) {
            A[--index] = B[--n2];
        }
        
        ////final solution
          int *pointer=malloc((n1+n2)*sizeof(int));
	        if(n2==0)
		        return A;
	        int index = n1 + n2;
            while (n1 > 0 && n2 > 0) {
                if (A[n1 - 1] > B[n2 - 1]) {
                    pointer[--index] = A[--n1];
                } else {
                    pointer[--index] = B[--n2];
                }
            }
        
        while (n2 > 0) {
            pointer[--index] = B[--n2];
        }
        
        while (n1 > 0) {
            pointer[--index] = A[--n1];
        }
        
	        return pointer;
         */

	}
}
