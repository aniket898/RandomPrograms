package try1;

import java.util.ArrayList;
import java.util.Scanner;

import try1.IntervalProb.Interval;

public class Pascal1 {
	
	    
	    public static void main(String[] args) {
	    	int rows =10;
	        
	       /* for(int i =0;i<rows;i++) {
	            int number = 1;
	            //System.out.format("%"+(rows-i)*2+"s","");
	            for(int j=0;j<=i;j++) {
	                 System.out.format("%4d",number);
	                 number = number * (i - j) / (j + 1);
	                 //System.out.println("\nnew no "+number);
	                
	            }
	            System.out.println();
	        }*/
	    	generate(3);
	        
	    }
	
	public static ArrayList<ArrayList<Integer>> generate(int A) {
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		int tempNum=1;
		for(int i =0;i<A;i++){
			tempNum=1;
			ArrayList<Integer> temp = new ArrayList<Integer>();
			 for(int j=0;j<=i;j++) {
                temp.add(tempNum);
                tempNum = tempNum * (i - j) / (j + 1);
            }
			result.add(temp); 
		}
	    
	    /*for(ArrayList<Integer> list:result){
	    	for(Integer i:list){
	    		System.out.print(i+" ");
	    	}
	    	System.out.println();
	    }*/
	    return result;
	    
	}	
}
