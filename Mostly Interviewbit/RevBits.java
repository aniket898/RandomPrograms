package try1;

public class RevBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long reverse = reverse(3);
		System.out.println(reverse);
	}
	public static long reverse(long A) {
		long reverse = 0;
		for(int i=0;i<32;i++){
			int bit = (int) (A & 1);
			A = A >> 1;
			reverse = reverse ^ bit;
			if(i!=31)
				reverse = reverse << 1;
		}
		return reverse;
	}

}
