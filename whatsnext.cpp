#include <iostream>
using namespace std;

int main() {
	int num1,num2,num3;
	scanf("%d %d %d",&num1,&num2,&num3);
	
	
	while(num1||num2||num3){
		if(num2-num1==num3-num2){
			cout<<"\nAP "<<num3+(num3-num2);
		} else {
			cout<<"\nGP "<<num3*(num3/num2);
		}
		scanf("%d %d %d",&num1,&num2,&num3);
	}	
	
	return 0;
}