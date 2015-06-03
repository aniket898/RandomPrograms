package try1;

import java.util.ArrayList;
import java.util.List;

public class MAXSUM {
	
    /*Driver program to test maxSubArraySum*/
    public static void main(String args[])
    {
       List a = new ArrayList();
       a.add(-2);
       a.add(-13);
       a.add(-1);
       /*a.add(-3);
       a.add(4);
       a.add(-1);
       a.add(-2);
       a.add(1);
       a.add(5);
       a.add(-3);*/
       int n = a.size();  
       int max_sum = maxSubArraySum(a, n);
       System.out.println("Maximum contiguous sum is "+ max_sum);
    }

	private static int maxSubArraySum(List<Integer> A, int n) {
		 int j,i,max = 0, maxTillHere = 0,allnegative=0,minNegative;
	        if(A.size()==0){
	            return 0;
	        }
	       minNegative = A.get(0);
	       for(j = 0; j < A.size(); j++){
	            if(A.get(j)>0){
	                break;
	            } else {
	                if(A.get(j)>minNegative)
	                    minNegative = A.get(j);
	            }
	        }
	        if(j==A.size())
	            return minNegative;
		   for(i = 0; i < A.size(); i++)
		   {
		     maxTillHere = maxTillHere + A.get(i);
		     if(maxTillHere < 0)
		        maxTillHere = 0;
		     else if(max < maxTillHere)
		        max = maxTillHere;
		    }
		    return max;
	}
}
