package java_fundamentals.section_2;

import java.util.Scanner;

public class Number21 {
	public static void main (String [] args) {
		System.out.println("who are you");
		Scanner sc = new Scanner(System.in);
		
		char f = sc.next().charAt(0);
		if (f == 'Д') {
			System.out.println("girls");
		}
		
		if (f == 'М') {
			System.out.println("Мне нравятся мальчики!");
		}
		
	}
}
