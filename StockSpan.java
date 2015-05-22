package try1;

import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stockPrices ={100,60,70, 65, 80, 85};
	 	int noDays  = stockPrices.length;
	 	calculateStockSpan(stockPrices, noDays);
	}


static void calculateStockSpan(int prices[], int days){
	 
	 Stack<Integer> priceStack = new Stack<Integer>();
	 int i;
	 int[] span= new int[days];
	 
	 if(days ==0) 
	 	return;
	 span[0] = 1;
	 
	 priceStack.push(0);
	 
	 for(i=1; i<days; i++){
	   while(prices[i] > prices[priceStack.peek()])
	      priceStack.pop();
	 
	   if(priceStack.empty()){
	      span[i] = i+1;
	   }
	   else{
	     span[i] =  i - priceStack.peek();
	   }
	   priceStack.push(i);
	 }
	 
	 for(i=0; i<days; i++)
	   System.out.println(" "+span[i]);
	 
	 System.out.println("\n");
	}
}



