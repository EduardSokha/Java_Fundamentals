package java_fundamentals.section_5;

public class Number6 {
	public static void main (String [] args) {
		int[] mas=new int[7];
		int ma = 0;
		int mi = 0;
		int max=10;
		int min=80;
		for(int i=0; i<mas.length; i++) {
			mas[i] = (int)(Math.random()*100);
			
			if(mas[i]>max) {
				max=mas[i];
				ma=max;
			}
			if(mas[i]<min) {
				min=mas[i];
				mi=min;
			}
		}
		
		for(int i=0; i<mas.length; i++) {
			System.out.println(mas[i]);
		}
		
		System.out.println("max="+ma);
		System.out.println("min="+mi);
		int y=ma-mi;
		System.out.println("y="+y);
	}
}
