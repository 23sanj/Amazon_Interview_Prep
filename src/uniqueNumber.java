import java.util.Scanner;

public class uniqueNumber {
	static final int INT_SIZE = 32;
	public static int findUnique(int arr[]){
		//Using Bitwise manipulation
		int ones=0,twos=0;
		int common=0;
		for(int i=0;i<arr.length;i++){
			twos = twos | (arr[i] & ones);
			ones = ones ^ arr[i];//add the new elements to ones
			
			//Now when the element appears for the third time--remove it
			common = ~(ones &twos);
			ones = common & ones;
			twos = common &twos;
		}
		
		return ones;
	}
	public static int findUnique2(int arr[]){
		int x=0;
		int result=0;
		//Summing the bits at each position--checking if multiple of 3
		for(int i=0;i<INT_SIZE;i++){
			int sum=0;
			x = (1<<i);
			for(int j=0;j<arr.length;j++){
				if((arr[j]&x) == 0){
					sum++;
				} 
				if(sum%3 == 0){
					result |= x;
				}
			}
		}
		return result;
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input:");
		int n= in.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++){
			a[i] = in.nextInt();
		}
		System.out.println("Output: "+ findUnique(a));
		System.out.println("Output: "+ findUnique2(a));
		
	}	

}
