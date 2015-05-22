import java.io.*;
import java.util.*;
import java.text.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        int testcases;
		Scanner in = new Scanner(System.in);
		//testcases = Integer.parseInt( in.nextLine());
		testcases = in.nextInt();
		boolean procCompleted = false;
		Map<Integer,String> mapVals = new HashMap<Integer,String>();
		String[] array = {};
		DecimalFormat df = new DecimalFormat("#0.000000");
		int number ;
		String answer = "";
		double decimalAnswer = 0;
		List<Integer> primeNos = new ArrayList<Integer>();
		List<Integer> allNos = new ArrayList<Integer>();
		int[] prevDiff = {2,4,6,8};
		List<Integer> tempList = new ArrayList<Integer>();
		
		
		while(testcases!=0){
			//number = Integer.parseInt( in.nextLine());;
			number = in.nextInt();
			if(procCompleted){
				//answer = array[number];
				answer = mapVals.get(number);
				
			} else {
				//System.out.println("Calculating");
				int originalNo = number;
				number = 5;
				//Generating the matrix nos : Base two cases :  
				mapVals.put(1, "0.000000");
				allNos.add(1);
				allNos.add(3);
				allNos.add(5);
				allNos.add(7);
				allNos.add(9);
				primeNos.add(3);
				primeNos.add(5);
				primeNos.add(7);
				decimalAnswer =  ((double)(primeNos.size() )/allNos.size())*100 ; 
				mapVals.put(3, df.format(decimalAnswer));
				
				while(number<10000){
					for(int i=0;i<prevDiff.length;i++){
						prevDiff[i]+=8;
					}
					int j = 3;
					int k=0;
					while(j!=-1){
						int no = allNos.get((allNos.size()-1)-j);
						no += prevDiff[k];
						tempList.add(no);
						j--; k++;
					}
					
					for(int no:tempList){
						allNos.add(no);
						if(isPrime(no)){
							primeNos.add(no);
						}
					}
					tempList.clear();
					decimalAnswer =  ((double)(primeNos.size() )/allNos.size())*100 ; 
					//array[number] = df.format(decimalAnswer);
					mapVals.put(number,df.format(decimalAnswer) );
					number+=2;
				}
				//System.out.println("Done Calculating");
				answer = mapVals.get(originalNo);
				procCompleted = true;
			}
			
			
			System.out.println(answer);
			testcases--;
		}
    }
    
    
    
    static boolean isPrime(int n){
		if (n <= 1)
			return false;
		else if(n <= 3)
			return true;
		else if( n % 2 == 0 || n % 3 == 0)
			return false;

        int i =5;
    	while (i*i<=n){
        if (n % i == 0 || n % (i + 2) == 0)
            return false;
            i += 6;
    	}    
        return true;
	}
}
