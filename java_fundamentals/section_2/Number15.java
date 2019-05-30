package java_fundamentals.section_2;

import java.util.Scanner;

public class Number15 {
	public static void main (String [] args) {
	double x = enter("enter first number"); 
	double y = enter("enter second number"); 
	if (x<y) {
		x=(x+y)/2;
		System.out.println("x="+x);	
		y=2*x*y;
		System.out.println("y="+y);	
	}else {
		y=(x+y)/2;
		System.out.println("y="+y);	
		x=2*x*y;
		System.out.println("x="+x);
	}
	
	
	}
	
	public static double enter (String message) {
	Scanner sc=new Scanner (System.in);
	double v;
	
	System.out.println(message);
	while (sc.hasNextDouble()==false) {
		sc.hasNext();
		System.out.println(message);
	}
	v=sc.nextDouble();
	
	return v;
}

}



