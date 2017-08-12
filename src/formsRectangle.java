import java.awt.Point;
import java.util.*;

public class formsRectangle {
	public double calcDist(Point p1, Point p2){
		return (p1.x -p2.x)*(p1.x -p2.x) + (p1.y -p2.y)*(p1.y -p2.y);
	}
	public boolean check(Point p1,Point p2,Point p3,Point p4){
		double d1= calcDist(p1,p2);//one distance --for length
		double d2= calcDist(p1,p3);//second distance for width
		double d3 = calcDist(p1,p4); //third distance for diagonal 
		
		//Check1-- total endpoints that must be unique is 4
		//Check2-- Atmost 3 distances--width,height and diagonal
		//check3 -- relationship between the 3 distances: should satisfy pythogrean rule--angle between then is 90
		HashSet<Point> set = new HashSet<Point>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		if(set.size() != 4){
			return false;
		}
		
		HashSet<Double> dist=new HashSet<Double>();
		dist.add(d1);
		dist.add(d2);
		dist.add(d3);
		
		if(dist.size() >3){
			return false;
		}
		if(d1 + d2 == d3 || d1 + d3 == d2 || d2 + d3 == d1){
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
		formsRectangle obj=new formsRectangle();
		
		System.out.println("Forms rectangle?"+ obj.check(p1,p2,p3,p4));
		
		
		
	}
}
