package try1;

public class Roman2Int {

	public static void main(String[] args) {
		String s = "IXII";
		int i = romanToInt(s);
		System.out.println(i);
	}
	public static int romanToInt(String A) {
		
		if(A.length()==0 || A==null)
			return 0;
		int length = A.length();
        int number = romanChartoInt(A.charAt(length-1));
        for (int i = 0; i < length-1; i++) {
            int a = romanChartoInt(A.charAt(i));
            int b = romanChartoInt(A.charAt(i+1));
            if (a < b) number -= a;
            else number += a;
        }
        return number;
	}
	
	public static int romanChartoInt(char c) {
        if (c == 'I'){ 
        	return 1;
        }
        else if (c == 'V'){ 
        	return 5;
        }
        else if (c == 'X'){ 
        	return 10;
        }
        else if (c == 'L'){ 
        	return 50;
        }
        else if (c == 'C'){ 
        	return 100;
        }
        else if (c == 'D'){ 
        	return 500;
        }
        else if (c == 'M'){ 
        	return 1000;
        }
        else 
        	return 0;
    }
}
