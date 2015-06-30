package try1;

import java.util.ArrayList;
import java.util.List;

public class hi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap<String,Integer> i =new HashMap<String, Integer>() ;
		int[] i = new int[5] ;
		List<Integer> a = new ArrayList<Integer>();
		i[0]=2;
		//System.out.println(i);
		hi2 h = new hi2();
		h.modifyi(i.clone());
		/*for (String string : i.keySet()) {
			System.out.println(string+" "+i.get(string));
		}*/
		System.out.println(i[0]);
		
	}

}
