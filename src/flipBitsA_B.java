import java.util.Scanner;

public class flipBitsA_B {
	public static int countSetBits(int n){
		int count=0;
		while(n>0){
			count += n&1;
			n >>=1;
		}
		return count;
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Input: a=");
		int a= in.nextInt();
		System.out.print("b=");
		int b= in.nextInt();
		

		
		System.out.println("Output: "+ countSetBits(a^b));
		
		
	}
}
