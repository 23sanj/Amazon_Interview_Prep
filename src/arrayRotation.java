import java.util.Scanner;

public class arrayRotation {
	
	public static void arrayRotationJuggling(int arr[],int d){
		
	}
	
	public static void oneRotation(int arr[]){
		int temp = arr[0];
		int n = arr.length;
		for(int i=0;i<n-1;i++){
			arr[i]=arr[i+1];
		}
		arr[n-1] = temp;
	}
	
	public static void arrayRotation1(int arr[],int d){
		for(int i=0;i<d;i++){
			oneRotation(arr);
		}
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input: 1. Enter number of positions 2. Enter size of arr 3. Enter arr");
		int d = in.nextInt();
		
		int n= in.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++){
			a[i] = in.nextInt();
		}
		
		arrayRotation1(a,d);
		System.out.println("Output: ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
	}	

}
