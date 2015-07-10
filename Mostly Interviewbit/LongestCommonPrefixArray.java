package try1;

import java.util.ArrayList;

public class LongestCommonPrefixArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> A = new ArrayList<String>();
		//A.add( "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		//A.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		//A.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		A.add("abcd");
		//A.add("aaaa");
		A.add("abcd");
		A.add("efgh");
		String s = longestCommonPrefix(A);
		System.out.println(s+"  :"+s.length());
	}
	public static String longestCommonPrefix(ArrayList<String> A) {
		if (A.size() == 0 || A==null) {
	        return "";
	    }
		
		int minStringLen=Integer.MAX_VALUE;
	    for(String str: A){
	        if(minStringLen > str.length())
	            minStringLen = str.length();
	    }
	    if(minStringLen == 0) return "";
		System.out.println(minStringLen);
		//int strZeroLen = A.get(0).length();
	    for (int length = 0; length < minStringLen; length++) {
	        char currentChar = A.get(0).charAt(length);
	        for (int i = 1; i < A.size(); i++) {
	            if ( A.get(i).charAt(length) != currentChar) {
	                return A.get(i).substring(0, length);
	            }
	        }
	    }
	    return A.get(0).substring(0, minStringLen);
	}
}
