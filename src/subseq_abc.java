import java.util.Scanner;

public class subseq_abc {
	public static int get_subseq(String s){
		int res=0;
		//Declare 3 sets to count the values of 3 diffn types of combinations
		int aCount=0,bCount=0,cCount=0;
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == 'a'){
				/*Add it to aCount--the presence of a character has 
				 * 3 possibliities--
				 * current character can begin a new subsequence-1
				 * Current character is a part of aCount subsequence
				 * Current character is not a part of aCount 
				 * */
				aCount = aCount*2 +1;
			}
			if(s.charAt(i) == 'b'){
				/*Add it to aCount--the presence of a character has 
				 * 3 possibliities--
				 * current character can begin a new subsequences of b after a
				 * Current character is a part of bCount subsequence
				 * Current character is not a part of bCount 
				 * */
				bCount = bCount*2 +aCount;
			}
			if(s.charAt(i) == 'c'){
				/*Add it to aCount--the presence of a character has 
				 * 3 possibliities--
				 * current character can begin a new subsequences of c after b
				 * Current character is a part of cCount subsequence
				 * Current character is not a part of cCount 
				 * */
				cCount = cCount*2 +bCount;
			}
		}
		return cCount;
		
	}
	
public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	System.out.print("Input:");
	String s= in.next();

	
	System.out.println("Output: "+ get_subseq(s));
	
	
}
}

