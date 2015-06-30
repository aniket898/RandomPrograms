package try1;

import java.util.ArrayList;
import java.util.Scanner;

public class IntervalProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ArrayList<Interval> intervals = new ArrayList<Interval>();
		int n=5;
		for(int i=0;i<n;i++){
			Interval temp = new Interval(in.nextInt(),in.nextInt());
			intervals.add(temp);
		}
		Interval newInterval = new Interval(in.nextInt(),in.nextInt());
		ArrayList<Interval> merged = insert(intervals, newInterval);
		for(Interval i:merged){
			System.out.println(i.start+" "+i.end);
		}
	}

	public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		 ArrayList<Interval> merged = new ArrayList<Interval>();
		 for(Interval i: intervals){
			 if(i.end < newInterval.start){
	           	merged.add(i);
	         }else if(i.start > newInterval.end){
	           	merged.add(newInterval);
	            newInterval = i;        
	         }else if(i.end >= newInterval.start || i.start <= newInterval.end){
	           	int newNum1 = Math.min(i.start, newInterval.start);
	           	int newNum2 = Math.max(newInterval.end, i.end);
	            newInterval = new Interval(newNum1, newNum2);
	         } 
	     }
	     merged.add(newInterval); 
	     return merged;
    }
	
	public static class Interval{
		int start;
		int end;
		public Interval(int num1, int num2) {
			this.start = num1;
			this.end = num2;
		}
		
	}	
}
