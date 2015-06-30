package try1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GaleShapley {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		Map<Integer, Integer[]> menPreferences = new HashMap<Integer,Integer[]>();
		Integer[] temp1 = {2,4,1,3};
		menPreferences.put(1, temp1);
		Integer[] temp2 = {4,1,2,3};
		menPreferences.put(2, temp2);
		Integer[] temp3 = {2,3,4,1};
		menPreferences.put(3, temp3);
		Integer[] temp4 = {2,3,4,1};
		menPreferences.put(4, temp4);
		
		Map<Integer, Integer[]> womenPreferences = new HashMap<Integer,Integer[]>();
		Integer[] temp5 = {2,3,4,1};
		womenPreferences.put(1, temp5);
		Integer[] temp6 = {3,4,2,1};
		womenPreferences.put(1, temp6);
		Integer[] temp7 = {3,2,1,4};
		womenPreferences.put(1, temp7);
		Integer[] temp8 = {2,3,4,1};
		womenPreferences.put(1, temp8);
	
		List men = new ArrayList<Integer>();
		men.add(1);
		men.add(2);
		men.add(3);
		men.add(4);
		
		List women = new ArrayList<Integer>();
		women.add(1);
		women.add(2);
		women.add(3);
		women.add(4);
		
		calculateStable(menPreferences,womenPreferences,men,women);
		
	}

	@SuppressWarnings({ "rawtypes", "unused" })
	private static void calculateStable(Map<Integer, Integer[]> menPreferences,
			Map<Integer, Integer[]> womenPreferences, List men, List women) {
		
		Integer manPref,womanPref,man;
		Integer[] womenList;
		Map<Integer,Integer> finalPreferences = new HashMap<Integer,Integer>();
		
		while(men.isEmpty()!=true){
			man= (int) men.get(0);
			womenList = menPreferences.get(man);
			for(int i=0;i<womenList.length;i++){
				if(!finalPreferences.containsKey(womenList[i]))
					{
						finalPreferences.put(womenList[i], man);
						men.remove(0);
					}
				else
				{
					int currentAssignedManPosition=0;
					int manToBeAssignedPosition=0;
					int toReAssign=0;
					Integer[] tempMenArray =  womenPreferences.get(womenList[i]);
					Integer currentAssignedMan = finalPreferences.get(womenList[i]);
					
					for(int j=0;j<tempMenArray.length;j++){
						if(tempMenArray[j] == currentAssignedMan){
							currentAssignedManPosition = j;
							toReAssign = tempMenArray[j];
						}
						else if(tempMenArray[j] == man)
							manToBeAssignedPosition = j;
					}
					
					if(manToBeAssignedPosition < currentAssignedManPosition){
						finalPreferences.put(womenList[i], man);
						men.remove(0);
						men.add(toReAssign);
						toReAssign=0;
					}
				}
			}
		}
		
		for(Integer key: finalPreferences.keySet()){
			System.out.println("\n"+key +" : "+finalPreferences.get(key));
		}
	}
	
	
}
