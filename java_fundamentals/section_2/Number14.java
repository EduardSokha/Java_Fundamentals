package java_fundamentals.section_2;

import java.util.Scanner;

public class Number14 {
	public static void main (String [] args) {
		int x = enter("enter first corner"); 
		int y = enter("enter second corner"); 
		
		if (x==90 || y==90) {
			System.out.println("прямоугольный");
		}
		if (x+y<180) {
			System.out.println("good");
			
		}else {
			System.out.println("invalid");
		}
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
