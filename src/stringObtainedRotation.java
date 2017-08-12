//Check if a string can be obtained from another by rotating it two places--either clockwise or anti-clockwise
import java.util.*;
public class stringObtainedRotation {
	static void reverse(char arr[],int i,int j){
		
		while(i<j){
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	
	static String clkwiseRotn(String s,int d){
		return antiClkwiseRotn(s,s.length()-d);
	}
	static String antiClkwiseRotn(String s,int d){
		char[] arr=s.toCharArray();
		int n= s.length();
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
		return new String(arr);
	}
	public static boolean checkRotation(String s1, String s2,int d){
		String sc = clkwiseRotn(s1,d);
		String sac = antiClkwiseRotn(s1,d);
		if(s2.equals(sc) || s2.equals(sac)){
			return true;
		}
		return false;
	}
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first string:");
		String s1 = in.next();
		System.out.println("Enter the test string:");
		String s2 = in.next();
		
		System.out.println("Enter number of positions to rotate");
		int d = in.nextInt();
		System.out.println(checkRotation(s1,s2,d));
		
		
	}

}
