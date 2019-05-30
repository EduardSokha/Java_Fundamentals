package java_fundamentals.first_20_tasks;

import java.util.Scanner;

public class number8 {
	public static void main (String[] args) {
	double a = enter("enter a");
	double b =enter("enter b");
	double c =enter("enter c");
	
	double z = (b + Math.sqrt(Math.pow(b,2)+4*a*c))/(2*a)-Math.pow(a,3)*c + Math.pow(b,-2);
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
