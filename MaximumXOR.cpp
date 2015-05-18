#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
typedef long long unsigned int ll;

bool check_bit(ll N,int POS){	
	ll a = 1;
	return ( N&(a<<POS) );
}

ll gaussian_elimination(vector<ll> arr){
	
	int size = arr.size();
	int number = 0;
	
	for(int bit=log2(arr[0]);bit>=0;bit--){
		
		if(number==size)
			continue;
		int bitVal = check_bit(arr[number],bit);
		
		if(bitVal == 1){
			
			for(int i=0;i<size;i++){
				
				if((i != number) && (check_bit(arr[i],bit) == 1)){
					arr[i] = arr[i]^arr[number];	
				}
				
			}
			number++;
		}else{
			for(int i=number+1;i<size;i++){
				
				if(check_bit(arr[i],bit) == 1){
					
					swap(arr[number],arr[i]);
					
					for(int j=0;j<size;j++){
						if((j != number) && (check_bit(arr[j],bit) == 1)){
							arr[j] = arr[j]^arr[number];	
						}
					}
					number++;
					break;
				}
			}
		}
		
	}
	
	ll ans = arr[0];
	for(int i=1;i<size;i++){
		ans = ans^arr[i];
	}
	
	return ans;
}

int main() {
	
	int n;
	vector<ll> arr;
	cin>>n;
	
	ll a;
	for(int i=0;i<n;i++){
		cin>>a;
		arr.push_back(a);
	}
	
	sort(arr.rbegin(),arr.rend());
	
	/*vector<ll>::iterator v = arr.begin();
   	while( v != arr.end()) {
     	 cout << "value of v = " << *v << endl;
      	v++;
  	 }*/


	cout<<gaussian_elimination(arr)<<"\n";
	
//	for(int i=63;i>=0;i--){
//		cout<<check_bit(1000000000000000000,60);	
//	}
	return 0;
}