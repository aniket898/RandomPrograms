package try1;

import java.util.ArrayList;
import java.util.List;

public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List<Integer> temp = new ArrayList<Integer>();
		temp.add(2);
		temp.add(2);
		temp.add(2);
		temp.add(3);
		//int uniqueNo = singleNumber2(temp);
		//System.out.println(uniqueNo);
		System.out.println(32 & 100);
		int arr[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 2, 2, 3, 7};
	    int n = arr.length;
	    System.out.println("The element with single occurrence is "+getSingle(arr, n));*/
		long A = 521;
		//System.out.println(A);
		int noOnes = numSetBits(A);
		System.out.println(noOnes);
	}
	public static int singleNumber(final List<Integer> A) {
	    int xor = 0;
	    for(Integer i:A){
	    	xor = xor ^ i; 
	    }
	    return xor;
	}
	
	
	public static int getSingle(int arr[], int n)
	{
	    // Initialize result
	    int result = 0;
	 
	    int x, sum;
	 
	    // Iterate through every bit
	    for (int i = 0; i < 32; i++)
	    {
	      // Find sum of set bits at ith position in all
	      // array elements
	      sum = 0;
	      x = (1 << i);
	      for (int j=0; j< n; j++ )
	      {
	          if ((arr[j] & x)==1)
	            sum++;
	      }
	 
	      // The bits with sum not multiple of 3, are the
	      // bits of element with single occurrence.
	      if ((sum % 3)==1)
	        result |= x;	
	    }
	 
	    return result;
	}

	
	public static int numSetBits(long A) {
		  int ones = 0;
		  while(A!=0) {
			  System.out.println(A);
		    A &= (A-1);
		    ones++;	
		  }
		  return ones;
	}
}
