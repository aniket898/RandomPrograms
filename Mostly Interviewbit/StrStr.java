package try1;

public class StrStr {

	public static void main(String[] args) {
		String s1 = "babbaaabaaaabbababaaabaabbbbabaaaabbabbabaaaababbabbbaaabbbaaabbbaabaabaaaaababbaaaaaabababbbbba";
		String s2 = "bbabaaaababbabbb";
		s1="bbaabbbbbaabbaabbbbbbabbbabaabbbabbabbbbababbbabbabaaababbbaabaaaba";
		s2 = "babaaa";
		s1="aabaaaababaabbbabbabbbaabababaaaaaababaaabbabbabbabbaaaabbbbbbaabbabbbbbabababbaaabbaabbbababbb";
		s2="bba";
		System.out.println(s1.length());
		int isSubString = strStr2(s1, s2);
		System.out.println(isSubString);
	}
	public static int strStr(final String haystack, final String needle) {
		int isSubstring=-1,first=0;
		if(haystack=="" && needle=="")
			return 0;
		else if(haystack == null || needle==null || haystack.length()==0 || needle.length()==0)
			return -1;
		else
		{
			int hayStackSize = findLen(haystack);
			int count=0;
			int k=0;
			int startSubStringChar = needle.charAt(0);
			for(int i=0;i<haystack.length();i++){
				int j=i;
				if(haystack.charAt(i)==needle.charAt(k)){
					count++;
					k++;
				} else {
					count = 0;
					k=0;
					while(haystack.charAt(i)!=startSubStringChar){
						if(i<haystack.length()-1)
							i++;
						else
							return -1;
					}
					first=i;
					count++;
					k++;
				}
				
				if(count==needle.length())
					return first;
				
				
				
				
			}
		}
		return isSubstring;
	}
	
	public static int strStr2(String haystack, String needle) {
		int temp=0;
		if(needle.length() == 0 || haystack==null || needle==null)
	        return -1;
	    for(int i=0; i<haystack.length(); i++){
	        if(i+needle.length() > haystack.length())
	            return -1;
	        temp = i;
	        for(int j=0; j<needle.length(); j++){
	            if(needle.charAt(j)==haystack.charAt(temp)) {
	                if(j==needle.length()-1)
	                    return i;
	                temp++;
	            } else
	                break;
	        }    
	    }   
	    return -1;
	}
	
	public static int findLen(String s){
		return s.toCharArray().length;
	}
}
