#include <iostream>
using namespace std;
int findWords(int charArray[26][26],int,int wordlength,int count);
char getCharacter(int n);
int getNumber(char c);

int main()
{
    int testcases;
    char c;
    int wordlength;
    int charArray[26][26];
    for(int i=0;i<26;i++){
                for(int j=0;j<26;j++){
                                cin>>charArray[i][j];
                }
    }
    cin>>testcases;
    while(testcases--){
    
                cin>>c;
                cin>>wordlength;
                int noWords = findWords(charArray,c-'a',wordlength,1);
                cout<<noWords<<endl;
    }
    return 0;
}

int findWords(int charArray[26][26],int position,int wordlength,int count){
                
                if(count == wordlength)
                                return 1;
                
                int noWords=0;
             //   cout<<position<<"\n";
                for(int i=0;i<26;i++){
                                if(charArray[i][position]==1){
                                    noWords += findWords(charArray,i,wordlength,count+1);
                                                
                                }
                }
                
                return noWords;
}

char getCharacter(int n){
                //assert(n >= 1 && n <= 26)
    return "abcdefghijklmnopqrstuvwxyz"[n-1];
}

int getNumber(char c){
                return (int)c - 'a';
}
