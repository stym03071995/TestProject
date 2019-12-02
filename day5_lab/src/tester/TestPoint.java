package tester;
import interfac.Point;
import java.util.*;
public class TestPoint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter co-ordinates");
			Point p1=new Point(sc.nextInt(),sc.nextInt());
			
			Point p2=new Point(sc.nextInt(),sc.nextInt());
			
	
			if(p1.equals(p2))
				System.out.println("Points are same");
			else
			{
				System.out.println("Points are not same");
			}
				
					
		}
		
		

	}


