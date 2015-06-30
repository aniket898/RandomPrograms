package try1;

import java.util.Scanner;

public class LengthWord {

	public static void main(String[] args) {
		String A = "    as    ";
		int length = lengthOfLastWord(A);
		System.out.println(length);
	}
	public static int lengthOfLastWord(final String A) {
		int length = 0,flag=0;
		/*String[] splited = A.split("\\s+");
		return splited[splited.length-1].length();*/
		if(A==null || A.length()==0)
			return 0;
		for(int i=A.length()-1;i>=0;i--){
			if(flag==0){
				while(A.charAt(i)==' '){
					if(i>=1)
						i--;
					else
						break;
				}
				flag=1;
			}
			if(A.charAt(i)==' ')
				break;
			else
				length++;
		}
		
		return length;
	}
}
