package java_fundamentals.section_2;

import java.util.Scanner;

public class Number17 {
	public static void main (String [] args) {
		int x = enter("enter first number"); 
		int y = enter("enter second number"); 
		if(x!=y) {
			if(x>y) {
				y=x;
			}
			if(x<y) {
				x=y;
			}
		}else {
		x=0;
		y=0;
		}
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
	
	
	public static int enter (String message) {
		Scanner sc=new Scanner (System.in);
		int v;
		
		System.out.println(message);
		while (sc.hasNextInt()==false) {
			sc.hasNext();
			System.out.println(message);
		}
		v=sc.nextInt();
		
		return v;
	}
}
