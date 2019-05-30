package java_fundamentals.section_2;

import java.util.Scanner;

public class Number20 {
	public static void main (String [] args) {
		int a =enter("ввести число a");
		int b = enter("ввести число b");
		int c =enter("ввести число c");
		int k = 3;
		char x ='/';
		char y ='/';
		char z ='/';
		
		if (a%k == 0) {
			System.out.println("a");
			x='a';
		}
		if (b%k == 0) {
			System.out.println("b");
			y='b';
		}
		if (c%k == 0) {
			System.out.println("c");
			z='c';
		}
		System.out.println("делятся на k: "+x+" "+y+" "+z);
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
