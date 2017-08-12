import java.util.Scanner;

public class rotateMatrix {
	//Program to rotate a matrix 90 degrees anticlockwise
	//first row-->first column in reverse order

	
	public static void matrixRotation(int mat[][]){
		//N*N matrix has N/2 cycles
		int n = mat.length;
		for(int i=0;i<n/2;i++){
			for(int j=i;j<n-1-i;j++){//considering elements in groups of 4
				int temp = mat[i][j];
				//move from right to top
				mat[i][j] = mat[j][n-1-i];
				//bottom to right
				mat[j][n-1-i] = mat[n-1-i][n-1-j];
				//left to bottom
				mat[n-1-i][n-1-j] = mat[n-1-j][i]; //Column is fixed--row is varied
				//changing temp to left
				mat[n-1-j][i] = temp;
			}
		}
		
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input: 1.Enter size of arr 3. Enter arr");
		
		int n= in.nextInt();
		int a[][]= new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
			a[i][j] = in.nextInt();
			}
		}
		
		matrixRotation(a);
		System.out.println("Output: ");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}	

}
