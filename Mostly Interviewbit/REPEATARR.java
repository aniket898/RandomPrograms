package try1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class REPEATARR {

	public static void main(String[] args) {
		List<Integer> temp = new ArrayList<Integer>();
		temp.add(3);
		temp.add(3);
		/*temp.add(3);
		temp.add(2);
		temp.add(2);
		temp.add(2);
		temp.add(1);
		temp.add(4);
		temp.add(6);*/
		int rNBo = repeatedNumber3(temp);
		System.out.println(rNBo);
	}
	public static int repeatedNumber(final List<Integer> A) {
		int repeatedNum=-1;
		Set numbers = new HashSet<Integer>();
		for(Integer i : A){
			if(!numbers.contains(i)){
				numbers.add(i);
			} else {
				repeatedNum = i;
				break;
			}
		}
		return repeatedNum;
	}

public static int repeatedNumber3(final List<Integer> A) {
		int repeatedNum=-1;
		int factor = A.size()/3;
		/*int arraySize = Collections.max(A);
		//System.out.println(arraySize);
		Integer[] numbers = new Integer[arraySize+1];
		for(int i=0;i<numbers.length;i++){
			numbers[i]=0;
		}
		for(int i=0;i<A.size();i++){
			int temp = A.get(i);
			numbers[temp] += 1;
			if(numbers[temp]>factor){
				repeatedNum = temp;
				break;
			}
		}*/
		if(A.size()<=2){
			return(A.get(0));
		}
		Map<Integer,Integer> countMap = new HashMap<Integer,Integer>();
		for(int i=0;i<A.size();i++){
			int tempNum = A.get(i);
			if(!countMap.containsKey(tempNum)){
				countMap.put(tempNum, 1);
			} else {
				int val = countMap.get(tempNum)+1;
				if(val>factor){
					repeatedNum = tempNum;
					break;
				} else {
					countMap.put(tempNum,val ) ;
				}
				
			}
		}
		
		return repeatedNum;
	}
}
