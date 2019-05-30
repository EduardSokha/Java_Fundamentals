package java_fundamentals.section_3;

import java.util.Scanner;

public class Number6 {
	public static void main (String [] args) {
		int x=0;
		int b=enter("enger limite");
		for(int i=1; i<=b; i++) {
			x+=i;
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
