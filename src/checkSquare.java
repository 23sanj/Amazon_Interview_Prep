import java.awt.Point;
import java.util.Scanner;

public class checkSquare {
	public double calcDist(Point p1, Point p2){
		return (p1.x -p2.x)*(p1.x -p2.x) + (p1.y -p2.y)*(p1.y -p2.y);
	}
	public boolean check(Point p1,Point p2,Point p3,Point p4){
		double d1= calcDist(p1,p2);//one distance --for length
		double d2= calcDist(p1,p3);//second distance for width
		double d3 = calcDist(p1,p4); //third distance for diagonal 
		
		if(d1 == d2 && 2*d2 == d3){
			return true;
		}
		else if(d1 == d3 && 2*d3 == d2){
			return true;
		}
		else if(d2 == d3 && 2*d2 == d1){
			return true;
		}
		else{
			return false;
		}
		
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter x and y co-ord for point 1");
		int x1= in.nextInt();
		int y1= in.nextInt();
		
		Point p1 = new Point(x1,y1);
		
		System.out.println("Enter x and y co-ord for point 2");
		int x2= in.nextInt();
		int y2= in.nextInt();
		
		Point p2 = new Point(x2,y2);
		
		System.out.println("Enter x and y co-ord for point 3");
		int x3= in.nextInt();
		int y3= in.nextInt();
		
		Point p3 = new Point(x3,y3);
		
		System.out.println("Enter x and y co-ord for point 4");
		int x4= in.nextInt();
		int y4= in.nextInt();
		
		Point p4 = new Point(x4,y4);
		checkSquare obj = new checkSquare();
		
		System.out.println("Forms square?"+ obj.check(p1,p2,p3,p4));
		
		
		
	}

}
