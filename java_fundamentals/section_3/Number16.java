package java_fundamentals.section_3;

public class Number16 {
	public static void main (String [] args) {
		int x=1;
		int b=1;
		for(int i=2; i<=7; i++) {
			
			b=b*(x+i);
			x+=i;
		}
	System.out.println(b);	
	}

}
