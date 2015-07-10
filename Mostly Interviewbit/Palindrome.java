package try1;

public class Palindrome {
	public static void main(String[] args) {
		int a = isPalindrome("A man, a plan, a canal: Panama");
		System.out.println(a);
	}
	
	public static int isPalindrome(String A) {
		int palindrome = 0;
		int start = 0;
		int end = A.length()-1;
		String lowerA = A.toLowerCase();
		while(end>=start){
			if(lowerA.charAt(start)==lowerA.charAt(end)){
				start++;
				end--;
			} else if(!Character.isLetterOrDigit(lowerA.charAt(start))){
				start++;
			} else if(!Character.isLetterOrDigit(lowerA.charAt(end))){
				end--;
			} else
				return 0;
		}
		return 1;	
		
	}
}
