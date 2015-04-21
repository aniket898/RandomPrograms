#include <iostream>
#include <cstring>
#include<string.h>
using namespace std;

int main() {
	char string1 [80];
	char string2 [80];
  	scanf("%s",string1);
  	scanf("%s",string2);
  	int len1 = strlen(string1);
  	int len2 = strlen(string2);
  	int dp[len1+1][len2+1];
  	
  	memset(dp,0,sizeof dp);
  	for(int i = 1; i <= len1; i++) {
		for(int j = 1; j <= len2; j++) {
			if(string1[i-1] == string2[j-1])
				dp[i][j] = dp[i-1][j-1] + 1;
			else
				dp[i][j] = max(dp[i-1][j],dp[i][j-1]);
		}
	}
	cout<<dp[len1][len2];
	return 0;
}