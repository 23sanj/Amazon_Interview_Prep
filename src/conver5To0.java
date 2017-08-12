import java.util.Scanner;

public class conver5To0 {
	//Recursive function to convert the number
	public static int convertRec(int n){
		if(n == 0){
			return 0;
		}
		int digit = (n%10==5)? 0: (n%10);
		return convertRec(n/10)*10+digit;
		
		
	}
	public static int convert(int n){
		if(n == 5){
			return 0;
		}
		else{
			return convertRec(n);
		}
	}
	
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input:");
		int n= in.nextInt();
		System.out.println("Output: "+convert(n));
		
	}	

}
