package java_fundamentals.section_3;

public class Number18 {
	public static void main (String [] args) {
		double x=1;
		int i=0;
		int e=5;
		double b=0;
		for(int j=1; j<=10; j++) {
			x=(Math.pow(2,j))/j;
			System.out.println("x="+x);	
			if(i==3) {
				continue;
			}
				
			if(x>=e) {
				b+=x;
				++i;
				//System.out.println("i="+i);
				//System.out.println("bbb="+b);
			}
		
		}
		System.out.println("final bbbb="+b);
		double a=(Math.pow((-1),(e-2)))/e;
		System.out.println("final aa="+a);
	}

}
/*for(i=1;i<4;i++) {
	
}*/