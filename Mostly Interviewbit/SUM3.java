package try1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SUM3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> temp = new ArrayList<Integer>();
		
		//String s = "-5,1,4,-7,10,-7,0,7,3,0,-2,-5,-3,-6,4,-7,-8,0,4,9,4,1,-8,-6,-6,0,-9,5,3,-9,-5,-9,6,3,8,-10,1,-2,2,1,-9,2,-3,9,9,-10,0,-9,-2,7,0,-4,-3,1,6,-3";
		String s = "10,1,6,10,-4,1,-3,-10,-7,10,-2,-5,1,7,-1,7,-9,-7,5,-2,7,-1,-1,10,6,0,-2,9,5,-9,4,8,3,-6,-7,0,9,3,0,-10,3,7,-9,10,-4,7,2,1,-9,3,10,4,0,-2,-5,-4,9,10,8,7,2,1,0,3,4,7,4,-3,0,8,-1";
		String[] tempStringArr = s.split(",");
		for(String s1:tempStringArr){
			temp.add(Integer.parseInt(s1));
		}
		/*temp.add(-1);
		temp.add(2);
		temp.add(1);
		temp.add(4);
		*/
		int sum = threeSumClosest((ArrayList<Integer>) temp, -1);
		System.out.println(sum);
	}

	public static int threeSumClosest(ArrayList<Integer> A, int B) {
		
		int closestSum = A.get(0) + A.get(1) + A.get(2);
        int difference = Math.abs(closestSum - B);
        
        Collections.sort(A);
        
        for (int i=0;i<A.size()-2;i++) {
            int second=i+1;
            int third=A.size()-1;
            while(second<third) {
                int newSum = A.get(i)+A.get(second)+A.get(third);
                int newDifference = Math.abs(newSum-B);
                if (newDifference < difference) {
                    difference = newDifference;
                    closestSum = newSum;
                }
                if (newSum < B)
                    second++;
                else
                    third--;
            }
        }
        return closestSum;
	}
	
	public static ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
		ArrayList<ArrayList<Integer>> triplets = new ArrayList<ArrayList<Integer>>();
		if (A.size() < 3)
			return triplets;
	 	Collections.sort(A);
	 	for (int i = 0; i < A.size() - 2; i++) {
			if (i == 0 || A.get(i) > A.get(i - 1)) {
				int negativeNo = -A.get(i);
				int second = i + 1;
				int third = A.size() - 1;
				while (second < third) {
					if (A.get(second) + A.get(third) == negativeNo) {
						ArrayList<Integer> temp = new ArrayList<Integer>();
						temp.add(A.get(i));
						temp.add(A.get(second));
						temp.add(A.get(third));
						triplets.add(temp);
						second++;
						third--;
						while (second < third && A.get(second) == A.get(second - 1))
							second++;
						while (second < third && A.get(third) == A.get(third + 1))
							third--;
					} else if (A.get(second) + A.get(third) < negativeNo) {
						second++;
					} else {
						third--;
					}
				}
			}
		} 
		return triplets;
	}
}
 