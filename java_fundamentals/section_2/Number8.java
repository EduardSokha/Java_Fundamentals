package java_fundamentals.section_2;

import java.util.Scanner;

public class Number8 {
	public static void main (String[] args) {
		int x=enter("первая");
		int y=enter("вторая");
		int x2=x*x;
		int y2=y*y;
		
		if (x2 > y2) {
			
			System.out.println("первое больше");
			
		}else {
			System.out.println("второе больше");
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
