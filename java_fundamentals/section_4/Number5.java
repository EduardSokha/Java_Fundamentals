package java_fundamentals.section_4;

import java.util.Scanner;

public class Number5 {
	public static void main (String [] args) {
		int a=enter("enter A");
		int b=enter("enter B");
		int c=enter("enter C");
		
		System.out.println("sum="+summ(a,b,c));
	}
	
	public static int summ (int A, int B, int C) {
		int a=A;
		int b=B;
		int c=C;
		int[] mas=new int[] {a,b,c};
		int max=1;
		int min=80;
		int sum=0;
		for(int i=0; i<mas.length; i++) {
			
			if(mas[i]>max) {
				max=mas[i];
				
			}
			if(mas[i]<min) {
				min=mas[i];
			}
		}
		
		
		for(int i=0; i<mas.length; i++) {
//			System.out.println(mas[i]);
		}
//		System.out.println("max="+max);
//		System.out.println("min="+min);
		sum=max+min;
//		System.out.println("sum="+sum);
		return sum;
		
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
