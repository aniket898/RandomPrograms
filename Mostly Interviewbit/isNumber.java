package try1;

public class isNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = " 1.e1";
		int result = isNumber(A);
		System.out.println(result);
	}
	public static int isNumber(final String A) {
		int temp1 = A.indexOf('.');
		int temp2 = A.indexOf('e');
		if(A.charAt(A.length()-1)=='.')
			return 0;
		else if(temp2==temp1+1)
			return 0;
		try{
			Double.parseDouble(A);
			return 1;
		}catch(NumberFormatException e){
			return 0;
		}
	    
	}

}
