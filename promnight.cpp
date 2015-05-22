#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main()
{
	int testCases;
    scanf("%d",&testCases);
    while(testCases--){
    	int noGirls=0,noBoys = 0,j=0;
    	int n,a,boyHeight=0,girlHeight=0;
    	//int boys[100001],girls[100001];
    	vector<int> boys;
    	vector<int> girls;
    	scanf("%d",&noBoys);
    	scanf("%d",&noGirls);
    	for(int i=0;i<noBoys;i++){
    		cin>>a;
			boys.push_back(a);
    	}
    	for(int i=0;i<noGirls;i++){
    		cin>>a;
			girls.push_back(a);
    	}
    	
    	sort(boys.begin(),boys.end());
    	sort(girls.begin(),girls.end());
    	
    	/*vector<int>::iterator v = girls.begin();
		while( v != girls.end()) {
      		cout << "value of v = " << *v << endl;
      		v++;
   		}*/
    	
		for(int i=0;i<noGirls;i++){
			if(j==noBoys)
				break;
			if(girls[i]<boys[j]){
				j++;
				continue;
			}
		}
		
		if(j==noBoys)
			cout<<"YES\n";
		else
			cout<<"NO\n";
    	/*while(boys.size()>0){
    		boyHeight = boys.front();
    		girlHeight = girls.front();
    		//cout<<"\n BH:"<<boyHeight<<" GH:"<<girlHeight;
    		if(boyHeight > girlHeight){
    			boys.erase(boys.begin());
    			girls.erase(girls.begin());
    		} else {
    			while(girls.front()>=boyHeight || girls.size()!=0){
    				//cout<<"\n GH:"<<girls.front();
    				girls.erase(girls.begin());
    			}
    			if(girls.size()==0){
    				cout<<"NO";
    				break;
    			} else {
    				boys.erase(boys.begin());
    				girls.erase(girls.begin());
    			}  		
    		}
    	}
    	
    	if(boys.size()==0)
    		cout<<"YES";
    	*/
    }
    return 0;
}
