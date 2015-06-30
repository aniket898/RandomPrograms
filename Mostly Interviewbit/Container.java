package try1;

import java.util.ArrayList;

public class Container {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int maxArea(ArrayList<Integer> A) {
		int maxArea=0;
		if (A == null || A.size() < 2) {
			return 0;
		}
		
		
		/*O(n^2) solution
		*for (int i=0; i<A.size()-1; ++i) {  
			for (int j=i+1; j<A.size(); ++j) {  
				int currentArea = (j - i) * Math.min(A.get(i), A.get(j));  
				if (currentArea > maxArea) 
					maxArea = currentArea;  
		   }  
		}*/
		
		int left=0;
		int right=A.size()-1;
		
		while(left<right){
			int currentArea = (right - left) * Math.min(A.get(left), A.get(right));
			maxArea = Math.max(maxArea, currentArea);
			if (A.get(left) < A.get(right))
				left++;
			else
				right--;
		}
		return maxArea;
	}
}
