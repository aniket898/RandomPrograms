#include <iostream>
#include <cstring>
#include<string.h>
using namespace std;

int main() {
	//char string1[250005];
	//char string2[250005];
	string string1;
	string string2;
	cin>>string1;
	cin>>string2;
  	//scanf("%s",string1);
  	//scanf("%s",string2);
  	int len1 = string1.length();
  	int len2 = string2.length();
  	int dp[len1+1][len2+1];
  	int maxSubString = 0;
  	memset(dp,0,sizeof dp);
  	
  	for(int i = 1; i <= len1; i++) {
		for(int j = 1; j <= len2; j++) {
			if(string1[i-1] == string2[j-1]) {
				dp[i][j] = dp[i-1][j-1] + 1;
				maxSubString = max(maxSubString, dp[i][j]);
			} else {
				dp[i][j] = 0;
			}	
		}
	}
	cout<<maxSubString<<"\n";
	return 0;
}