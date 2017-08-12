import java.awt.*;
import java.util.*;

public class rectanglesOverlap {
	public static boolean checkOverlap(Point l1, Point r1, Point l2, Point r2){
		if(r1.x > l2.x || r2.x > l1.x)//One rectangle on top of another
		{
			return false;
		}
		else if(l2.y>r1.y || l1.y>r2.y){//one rectangle next to the other
			return false;
		}
		else{
			return true;
		}
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Input first rectangle top-left co-ord:");
		int x1= in.nextInt();
		int y1 = in.nextInt();
		Point l1 = new Point(x1,y1);
		System.out.println("Input first rectangle bottom-right co-ord:");
		int x2= in.nextInt();
		int y2 = in.nextInt();
		Point r1 = new Point(x2,y2);
		
		
		System.out.println("Input second rectangle top-left co-ord:");
		int x3= in.nextInt();
		int y3 = in.nextInt();
		Point l2 = new Point(x3,y3);
		System.out.println("Input first rectangle bottom-right co-ord:");
		int x4= in.nextInt();
		int y4 = in.nextInt();
		Point r2 = new Point(x4,y4);
		
		
		System.out.print(checkOverlap(l1,r1,l2,r2));
	}

}
