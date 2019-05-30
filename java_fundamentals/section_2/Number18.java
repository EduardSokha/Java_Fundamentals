package java_fundamentals.section_2;

import java.util.Scanner;

public class Number18 {
	public static void main (String [] args) {
		double a=enter("ввести число a");
		double b=enter("ввести число b");
		double c=enter("ввести число c");
		int x = 0;
		
		if (a<0) {
			x++;
		}
		if (b<0) {
			x++;
		}
		if (c<0) {
			x++;
		}
		
		System.out.println(x);
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
