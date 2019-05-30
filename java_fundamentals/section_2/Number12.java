package java_fundamentals.section_2;

import java.util.Scanner;

public class Number12 {
	public static void main (String [] args) {
		
		double x=enter("ввести число");
		
		if (x>0) {
			x=Math.pow(x, 2);
			System.out.println(100);
		}
		
		if (x<0) {
			x=Math.pow(x, 4);
			System.out.println(x);
		}
	
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
