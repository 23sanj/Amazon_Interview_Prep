import java.util.Scanner;

public class extraNumber {
	public static int extraNumberIndex(int a1[],int a2[]){//Linear Search-O(n)
		for(int i=0;i<a2.length;i++){
			if(a2[i] != a1[i]){
				return i+1;
			}
		}
		return 0;
	}
	public static int extraNumberIndexEff(int a1[],int a2[],int n){//Binary Search -O(logn)
		int low = 0,high=n-1;
		int index=0;
		while(low<=high){
			int mid = (low+high)/2;
			if(a1[mid] == a2[mid]){//If middle element is the same for both elements--extra element is on the right
				low =mid+1;
			}
			else {
				index= mid+1;
				high=mid-1;
			}
		}
		return index;
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input: first array");

		int n1= in.nextInt();
		int a1[]= new int[n1];
		for(int i=0;i<n1;i++){
			a1[i] = in.nextInt();
		}
		
		System.out.print("Input: second -larger array");

		int a2[]= new int[n1+1];
		for(int i=0;i<n1+1;i++){
			a2[i] = in.nextInt();
		}
		
		
	
		System.out.println("Output: "+extraNumberIndex(a1,a2));
		System.out.println("Output: "+extraNumberIndexEff(a1,a2,a2.length));
		
	}	

}
