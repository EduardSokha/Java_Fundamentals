package java_fundamentals.section_2;

import java.util.Scanner;

public class Number9 {
	public static void main (String[] args) {
		int x=enter("1 сторона");
		int y=enter("2 сторона");
		int z=enter("3 сторона");
		
		if (x == y||y==z||z==x) {
			if (x ==y && y==z) {
				System.out.println("равносторонний");
			}
			System.out.println("равнобедренный");
			
		}else {
			System.out.println("не равнобедренный");
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
