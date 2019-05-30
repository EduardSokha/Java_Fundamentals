package java_fundamentals.section_5;

public class Number7 {
	public static void main (String [] args) {
		int[] mas=new int[7];
		int j = 0;
		
		int z=70;
		
		for(int i=0; i<mas.length; i++) {
			mas[i] = (int)(Math.random()*100);
			System.out.println("before mas="+mas[i]);
			
			if(mas[i]>z) {
				mas[i]=z;
				++j;
				System.out.println("z="+z);
			}
		
		}
		
		for(int i=0; i<mas.length; i++) {
			System.out.println(mas[i]);
		}
		
		System.out.println("j="+j);
		//System.out.println("min="+mi);
		
	}

}
