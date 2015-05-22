#include<iostream>
#include<stdio.h>
#include<queue>
using namespace std;


int visited[1000000]; 
struct Node { 
	int floorNo; 
	int depth; 
}; 
queue <Node> nodes;

int main() {
	struct Node temp2;
	int floorReached=0;
	int maxFloorsReached,minFloorsReached;
	int f,s,g,u,d; 
	struct Node temp; 
	scanf("%d%d%d%d%d",&f,&s,&g,&u,&d); 
	if(s==g) { 
		printf("0\n"); 
	} else { 
		temp.floorNo=s; 
		temp.depth=0; 
		nodes.push(temp); 
		visited[temp.floorNo]=1; 
		
		while(!nodes.empty()){
			temp2 = nodes.front();
			if(temp2.floorNo==g){
				floorReached = 1;
				break;
			};
			nodes.pop();
			struct Node upNode;
			struct Node downNode;
			if(temp2.floorNo + u <= f && !visited[temp2.floorNo + u]){
				upNode.floorNo = temp2.floorNo + u;
				upNode.depth = temp2.depth + 1;
				//cout<<"\nUp node"<<upNode.floorNo<<", "<<upNode.depth;
				nodes.push(upNode);
				visited[upNode.floorNo]=1;
			}
			if(temp2.floorNo - d > 0 && !visited[temp2.floorNo - d]){
				downNode.floorNo = temp2.floorNo - d;
				downNode.depth = temp2.depth + 1;
				//cout<<"\nDown node"<<downNode.floorNo<<", "<<downNode.depth;
				nodes.push(downNode);
				visited[downNode.floorNo]=1;
			}	
		}
		
		if(floorReached==0) { 
			printf("use the stairs"); 
		} else 
			printf("%d\n",temp2.depth); 
	}
	return 0;
}