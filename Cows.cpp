#include<iostream>
#include<algorithm>
#include<cstdio>
using namespace std;


int noCows,noStands;
int stands[100001];

int findMinDist(int x){
	int cowsplaced=1;
	long long int last_position=stands[0];
	for(int i=1;i<noStands;i++){
		if(stands[i]-last_position>=x){
			cowsplaced++;
            
			if(cowsplaced==noCows)
			  return 1;
            last_position=stands[i];
		  }
	  }
	  return 0;
}
int binarySearch(){
	int start=0,end=stands[noStands-1];
	while(start<end){
		int mid=(start+end)/2;
		if(f(mid)==1)
		    start=mid+1;
		else
		    end=mid;
		}
	return start-1;
}
	 
int main(){
	int testCases;
	scanf("%d",&testCases);
	
	while(testCases--){
		scanf("%d %d",&noStands,&noCows);
		for(int i=0;i<noStands;i++){
		  scanf("%d",&stands[i]);
		}
        sort(stands,stands+noStands);
		cout<<"Minimum Distance ="<<binarySearch();
     }
 }