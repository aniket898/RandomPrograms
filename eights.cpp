#include<iostream>
#include<cstdio>
using namespace std;
int main()
{
    long long testcases,k,answer;
    cin>>testcases;
    while(testcases--)
    {
        scanf("%lld",&k);
        answer = 192+(k-1)*250;
        cout<<answer<<"\n";
    }
    return 0;
}