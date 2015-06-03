#include <iostream>
using namespace std;

int main() {
	
	int test,n,c[55],sum = 0;
	bool flag;
	scanf("%d",&test);
	
	while(test--){
		
		cin>>n;
		sum = 0;
		flag = true;
		for(int i=1;i<=n;i++){
			cin>>c[i];
			if(c[i] > (n-1)){
				flag = false;	
			}
			sum += c[i];
		}
		
		if(sum != n || flag == false){
			cout<<"-1\n";
			continue;
		}
		
		int done[n+5] = {0};
		int i = 1;
		while(i < n){
			
			if(c[i] == 0){
				i++;
				continue;
			}
			
			int j = i+1;
			while(c[j] == 0 && j<=n){
				j++;
			}
			
			if(j == (n+1)){
				
				if(c[1] != 0){
					c[i]--;
					done[1] = i;
				}
				break;
				
			}else{
				
				c[i]--;
				done[j] = i;
				i = j;	
				
			}
			
		}
		
		for(i=1;i<=n;i++){
			
			if(c[i] != 0){
				
				int j = i+1;
				while(c[i] != 0 && j!= i){
					
					if(j == (n+1)){
						j = 1;
					}
					
					if(c[j] == 0 && done[j] == 0){
						c[i]--;
						done[j] = i;
					}
					j++;
				}
			}
			
		}
		
		for(int i=1;i<=n;i++){
			cout<<done[i]<<" ";
		}
		cout<<"\n";
		
	}

	return 0;
}