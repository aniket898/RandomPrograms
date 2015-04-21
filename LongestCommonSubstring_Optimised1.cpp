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
  	int dp[2][250000];
  	int maxSubString = 0;
  	int currentRow;
  	memset(dp,0,sizeof dp);
  	
  	for(int i = 1; i <= len1; i++) {
  		if(i%2==0)
  			currentRow = 0;
  		else
  			currentRow =1;
		for(int j = 1; j <= len2; j++) {
			if(string1[i-1] == string2[j-1]) {
				if(currentRow == 0){
					dp[currentRow][j] = dp[1][j-1] + 1;
				} else if(currentRow == 1){
					dp[currentRow][j] = dp[0][j-1] + 1;
				}
				maxSubString = max(maxSubString, dp[currentRow][j]);
			} else {
				dp[currentRow][j] = 0;
			}	
		}
	}
	cout<<maxSubString<<"\n";
	return 0;
}