package try1;

import java.util.Scanner;

public class editDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char string1[2005];
		Scanner in = new Scanner(System.in);
		String string1;
		String string2;
		
		//char string2[2005];
		int testcases = in.nextInt();
		
		//scanf("%d",&testcases);
		
		while(testcases!=0){
			int[][] dp = new int[2005][2005];
			//scanf("%s",string1);
		  	//scanf("%s",string2);
		  	string1 = in.next();
		  	string2 = in.next();
			//cin>>string1;
		  	//cin>>string2;
		  	int len1 = string1.length();
		  	int len2 = string2.length();
		  	char[] s1 = string1.toCharArray();
		  	char[] s2 = string2.toCharArray();
		  	//memset(dp,0,sizeof dp);
		  	//cout<<rows<<" : "<<columns<<"\n";
		  	
		  	for(int i = 0;i <= len1;i++){
		  		dp[i][0] = i;
		  	}
		  	for(int i = 0;i <= len2;i++){
		  		dp[0][i] = i;
		  	}
		  	
		  	/*for(int i =0;i<rows;i++){
		  		for(int j=0;j<columns;j++){
		  			cout<<"  "<<dp[i][j];
		  		}
		  		cout<<"\n";
		  	}*/
		  	//top-deletion left-insertion diagonal-substitution
		  	
		  	for(int i = 1; i <= len1; i++) {
				for(int j = 1; j <= len2; j++) {
					if(s1[i-1] == s2[j-1])
						dp[i][j] = Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]+1),dp[i][j-1]+1);
					else
						dp[i][j] = Math.min(Math.min(dp[i-1][j-1]+1,dp[i-1][j]+1),dp[i][j-1]+1);
				}
			}
			
			
		  	System.out.println(dp[len1][len2]+"\n");
		  	testcases--;
		}
		
	}

}
