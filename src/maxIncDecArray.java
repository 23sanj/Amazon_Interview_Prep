import java.util.Scanner;

public class maxIncDecArray {
	public static int findMax(int arr[],int low,int high){//Linear Search -O(n)
		int max= arr[low];
		for(int i=low;i<=high;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		return max;
	}
	//Compare adjacent pairs
	public static int findMaxEff(int arr[],int low,int high){//Binary Search-O(logn)
		if(low==high){//If only 1 element--base case
			return arr[low];
		}
		if(low+1==high)//If two elements
		{
			if(arr[low]>arr[high])//If first element is greater than second
				return arr[low];
			else 
				return arr[high];
		}
		int mid = (low+high)/2;
		//If arr[mid] is greater than both the left and the right side elements--its max
		if((arr[mid] > arr[mid-1]) && (arr[mid] > arr[mid+1])){
			return arr[mid];
		}
		//If arr[mid] is greater than the left side element but smaller than the rightside--max lies on the rightside
		if((arr[mid] > arr[mid+1]) && (arr[mid] < arr[mid-1])){
			return findMaxEff(arr,low,mid-1);
		}
		else{
			return findMaxEff(arr,mid+1,high);
			
		}
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input:");
		int n= in.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++){
			a[i] = in.nextInt();
		}
		System.out.println("Output: "+ findMax(a,0,n-1));
		System.out.println("Output: "+ findMaxEff(a,0,n-1));
		
	}	

}
