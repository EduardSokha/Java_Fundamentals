package java_fundamentals.section_2;

import java.util.Scanner;

public class Number4 {
	public static void main (String[] args) {
		int x = enter("������� 1 �����");
		int y = enter("������� 2 �����");
		if (x != y) {
			System.out.println("�� �����");
		}else {
			System.out.println("�����");
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
