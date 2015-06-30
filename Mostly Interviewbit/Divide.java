package try1;

public class Divide {

	public static void main(String[] args) {
		int remainder = divide(-2147483648, -10000000);
		System.out.println(remainder);
		//System.out.println(Integer.MIN_VALUE);
	}
	
	public static int divide(int dividend, int divisor) {
	    int remainder=0;
	    long shiftCount = 1;
		long dividendL = Math.abs(dividend);
		
	    long divisorL = Math.abs(divisor);
	    if(dividend==0 || divisor==0){
	    	return 0;
	    }
	    
	    while(dividendL>divisorL){
	    	divisorL = divisorL << 1;
	    	shiftCount = shiftCount << 1;
	    }
	    
	    while(dividendL>=Math.abs(divisor)){
	    	while(dividendL>=divisorL){
		    	dividendL -= divisorL;
		    	remainder += shiftCount;
		    }
	    	divisorL = divisorL >> 1;
	    	shiftCount = shiftCount >> 1;
	    }
	    if(dividend==Integer.MIN_VALUE && divisor == -1)
	    	remainder=Integer.MAX_VALUE;
	    if(dividend==Integer.MIN_VALUE && divisor == 1)
	    	remainder=Integer.MIN_VALUE;
	    
	    /*if(remainder>=Integer.MAX_VALUE)
			remainder= Integer.MAX_VALUE;*/
	    //if(remainder>=Integer.MAX_VALUE)
	    //	return Integer.MAX_VALUE;
	    if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0))
            return remainder;
        else
            return -remainder;
	}
	
	/*correct code
	 * int remainder = 0;
		unsigned long shiftCounter = 1;
        unsigned long long dividendL = abs((long long)dividend);
        unsigned long long divisorL = abs((long long)divisor);
        while (dividendL>divisorL){
            divisorL = divisorL<<1;    
            shiftCounter = shiftCounter<<1;
        }
        while (dividendL>=abs((long long)divisor)){
            while (dividendL>=divisorL){
                dividendL -= divisorL;
                remainder = remainder+shiftCounter;
            }
            divisorL=divisorL>>1;
            shiftCounter=shiftCounter>>1;    
        }
        if(dividend == -2147483648 && divisor ==-1)
            return 2147483647;
        if(remainder>2147483647)  
            return 2147483647;
        if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0))
            return remainder;
        else
            return -remainder;
	 * */
}
