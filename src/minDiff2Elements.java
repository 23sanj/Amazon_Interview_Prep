import java.util.Arrays;
import java.util.Scanner;

public class minDiff2Elements {
	public static int findMinDiff(int arr[]){//O(n^2)
		int minDiff = Integer.MAX_VALUE;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				minDiff = (Math.abs(arr[i]-arr[j]) < minDiff)? Math.abs(arr[i]-arr[j]):minDiff;
			}
		}
		return minDiff;
	}
	//Compare adjacent pairs
	public static int findMinEffDiff(int arr[]){//O(nlogn)
		int minDiff = Integer.MAX_VALUE;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++){
			minDiff= (Math.abs(arr[i]-arr[i+1]) < minDiff)? Math.abs(arr[i]-arr[i+1]):minDiff ;
		}
		return minDiff;
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input:");
		int n= in.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++){
			a[i] = in.nextInt();
		}
		System.out.println("Output: "+ findMinDiff(a));
		System.out.println("Output: "+ findMinEffDiff(a));
		
		
	}

}
