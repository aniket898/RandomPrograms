package try1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxDist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> temp = new ArrayList<Integer>();
		temp.add(3);
		temp.add(2);
		temp.add(1);
		//temp.add(3);
		int max = maximumGap(temp);
		System.out.println(max);
	}
	
	public static int maximumGap(final List<Integer> A) {
		int maxDifference = -1;
		/*int startIndex = 0;
		int endIndex = A.size()-1;
		int maxDifference = -1;
		for(int i=startIndex;i<=endIndex;i++){
			for(int j=endIndex;j>i;j--){
				if(A.get(i)<A.get(j) && maxDifference<(j-i)){
					maxDifference=j-i;
				}
			}
		}
		
		return maxDifference;*/
		if(A.size()==0)
			return -1;
		if(A.size()==1)
			return 0;
		int decreasingOrderCount = 0;
		List<Number> numbers = new ArrayList<Number>();
		for(int i=0;i<A.size();i++){
			Number temp = new Number(A.get(i),i);
			numbers.add(temp);
		}
		
		for(int i=1;i<A.size();i++){
			if(numbers.get(i).value<numbers.get(i-1).value){
				decreasingOrderCount++;
			} else {
				break;
			}
		}
		if(decreasingOrderCount==A.size()-1){
			return 0;
		}
		
		Comparator<Number> newComparator = new Comparator<Number>() {

			@Override
			public int compare(Number o1, Number o2) {
				if(o1.value<o2.value){
					return -1;
				} else if(o1.value==o2.value){
					return 0;
				} else {
					return 1;
				}
				
			}
			
		};
	
		Collections.sort(numbers,newComparator);
		
		for(int i=numbers.size()-1;i>=0;i--){
			//System.out.println("hello");
			//System.out.println(" "+numbers.get(i).value);
			int rightIndex = numbers.get(i).index;
			for(int j=i-1;j>=0;j--){
				int leftIndex = numbers.get(j).index;
				if(leftIndex>=rightIndex)
					break;
				else{
					maxDifference = Math.max(maxDifference,(rightIndex-leftIndex));
				}
			}	
		}

		return maxDifference;
	}	
	
	public static class Number{
		int value;
		int index;
		public Number(int value, int index) {
			this.value = value;
			this.index = index;
		}
		
	} 
}


