package java_fundamentals.section_5;

public class Number5 {
	public static void main (String [] args) {
		int[] mas=new int[7];
		int[] maseven=new int[5];
		
		int z=0;
		
		for(int i=0; i<mas.length; i++) {
			mas[i] =(int)(Math.random()*100);
			
			if(mas[i]%2==0) {
				maseven[z]=mas[i];
				++z;
				
			}
		}
		if(z==0) {
			System.out.println("even numbers left");
		}
		
		System.out.println("z="+z);
		for(int i=0; i<mas.length; i++) {
			System.out.println("mas="+mas[i]);
		}
		for(int i=0; i<maseven.length; i++) {
			System.out.println("maseven="+maseven[i]);
		}
		
	}

}
