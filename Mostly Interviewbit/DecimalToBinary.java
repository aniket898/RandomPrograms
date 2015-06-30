package try1;

public class DecimalToBinary {
	public void printBinaryFormat(long number){ 
		long binary[] = new long[65]; 
		int index = 0; 
		while(number > 0){ 
			binary[index++] = number%2; 
			number = number/2; 
		} 
		for(int i = index-1;i >= 0;i--){ 
			System.out.print(binary[i]); 
		} 
	} 
	
	public static void main(String a[]){ 
		long b = 25;
		DecimalToBinary dtb = new DecimalToBinary(); 
		dtb.printBinaryFormat(b); 
	}
}
