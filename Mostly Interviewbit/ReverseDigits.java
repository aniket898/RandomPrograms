package try1;

public class ReverseDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=-1234567891;
		int reverse = reverse(A);
		System.out.println(reverse);
	}
	public static int reverse(int A) {
		int reverse = 0;
		int cnt=0;
	    while(A != 0){
	    	
	    	int temp = (A%10);
	    	if(cnt==9 && ((reverse>214748364 && temp<=7) || (reverse <-214748364 && temp>=-8))){
	    		return 0;
	    	}
	        reverse = (reverse*10) + temp;
	        cnt++;
	        A = A/10;
	    }
	    return reverse;
	}

}
