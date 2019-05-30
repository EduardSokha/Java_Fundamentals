package java_fundamentals.first_20_tasks;

import java.util.Scanner;

public class number16 {
	public static void main (String[] args) {
		
		
		int x= enter("X");
		
		
		
		/*if(sc.hasNextInt()==true)
		{
		int z=sc.nextInt();	
		System.out.println("int");
		}else {
			//String s = sc.next();
			System.out.println("noint");
		}	*/
		
		
		
		int n4=x%10;
		//System.out.println(n4);
		int n3=(x/10)%10;
		//System.out.println(n3);
		int n2=(x/100)%10;
		//System.out.println(n2);
		int n1=(x/1000)%10;
		//System.out.println(n1);
		int z = n1*n2*n3*n4;
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
