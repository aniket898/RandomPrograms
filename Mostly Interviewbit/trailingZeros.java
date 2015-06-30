package try1;

public class trailingZeros {
	public static void main(String[] args){
		trailingZeroes(400);
	}
	
	public static int trailingZeroes(int A) {
		//int fact = factorial(A);
		//System.out.println(fact);
		int noZeroes=0;
		for (int i=5;A/i>0; i*=5)
			noZeroes += A/i;
		System.out.println(noZeroes);
		return noZeroes;
	    
	}
	
	public static int factorial(int A){
	    if(A == 1 || A ==0)
	    	return 1;
	    else
	    	return A*factorial(A-1);
	}
}
