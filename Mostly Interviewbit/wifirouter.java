package try1;

import java.util.Scanner;

public class wifirouter {
	
	public static void main(String[] args){
		int testcases;
		Scanner in = new Scanner(System.in);
		testcases = in.nextInt();
		int noRouters,noUsers;
		int[][] routerCoords = null,userCoords = null;
		
		while(testcases!=0){
			noRouters = in.nextInt();
			noUsers = in.nextInt();
			
			for(int i =0;i<noRouters;i++){
				for(int j=0;j<2;j++){
					routerCoords[i][j] = in.nextInt();
				}
			}
			for(int i =0;i<noUsers;i++){
				for(int j=0;j<2;j++){
					userCoords[i][j] = in.nextInt();
				}
			}
			
			// Get maximum of minimum distances between users and routers
			double tempMinUserRouterDistance;
			double[] minUserRouterDistance = null;
			for(int i=0;i<userCoords.length;i++){
				tempMinUserRouterDistance = Integer.MAX_VALUE;
				for(int j=0;j<routerCoords.length;j++){
					double tempDist = checkdistance(userCoords[i][0],userCoords[i][1],routerCoords[j][0],routerCoords[j][1]);
					if(tempDist<tempMinUserRouterDistance)
						tempMinUserRouterDistance = tempDist;
				}
				minUserRouterDistance[i] = tempMinUserRouterDistance;
			}
			
			double maxUserRouterDistance = minUserRouterDistance[0];
			for(int i=1;i<minUserRouterDistance.length;i++){
				if(minUserRouterDistance[i]>maxUserRouterDistance)
					maxUserRouterDistance = minUserRouterDistance[i];
			}
			
			
			double maxRouterRouterDistance = 0.0;
			
			// Generate router graph with distance as edges
			double[][] routerGraph = {};
			for(int i =0;i<noRouters;i++){
				for(int j=0;j<noRouters;j++){
						if(i==j){
							routerGraph[i][i] = 0.0;
						} else {
							routerGraph[i][j] = checkdistance(routerCoords[i][0],routerCoords[i][1],routerCoords[j][0],routerCoords[j][1]);
						}
				}
			}	
			
			//Generate Minimum Spanning Tree and get max edge
			int noVertices = noRouters;
			
			
			
			
			double answer = Math.max(maxUserRouterDistance, maxRouterRouterDistance);
			
			testcases--;
		}
	}

	private static double checkdistance(int i, int j, int k, int l) {
		return Math.sqrt((i-k)*(i-k)+(j-l)*(j-l));
		
	}
}