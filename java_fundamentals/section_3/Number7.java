package java_fundamentals.section_3;

public class Number7 {
	public static void main (String [] args) {
		int y=0;
		for(int i=-2; i<6; i++) {
			if (i>2) {
				y=i;
				System.out.println("y="+y);				
			}
			if (i<=2) {
				y=-i;
				System.out.println("y="+y);				
			}
			
		}
		
	}

}
