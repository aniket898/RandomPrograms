#include <iostream>
#include <algorithm>

using namespace std;

int main() {
	int testcases;
    cin>>testcases;
    while(testcases--)
    {
        int Godzillas,MechaGodzillas;
        cin>>Godzillas;
        cin>>MechaGodzillas;
        int i,GMonsters[Godzillas],MGMonsters[MechaGodzillas];
        for(i=0;i<Godzillas;i++)
        	cin>>GMonsters[i];
        for(i=0;i<MechaGodzillas;i++)
            cin>>MGMonsters[i];
        sort(GMonsters,GMonsters+Godzillas);
        sort(MGMonsters,MGMonsters+MechaGodzillas);
        if(GMonsters[Godzillas-1]>=MGMonsters[MechaGodzillas-1])
            cout<<"Godzilla\n";
        else
            cout<<"MechaGodzilla\n";
    }
	
	
	return 0;
}