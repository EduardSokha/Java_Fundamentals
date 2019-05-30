package java_fundamentals.first_20_tasks;

import java.util.Scanner;

public class number10 {
	public static void main (String[] args) {
		int x=enter("enter x");
		int y=enter("enter y");
		double z=(Math.sin(x) + Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x)*y;
		System.out.println(z);
	}
	
	public static int enter (String message ) {
		Scanner sc = new Scanner(System.in);
		int c;
		System.out.println(message);
		
		while(sc.hasNextInt()==false) {
			String s = sc.next();
			System.out.println("not int");
			System.out.println("enter int");
		}
		c=sc.nextInt();
		return c;
	}
}
