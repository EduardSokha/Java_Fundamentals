package java_fundamentals.section_5;

public class Number9 {
	public static void main (String [] args) {
		int[] mas=new int[7];
		int ma = 0;
		int mi = 0;
		int max=10;
		int min=80;
		int a=0;
		int b=0;
		int v=0;
		for(int i=0; i<mas.length; i++) {
			mas[i] = (int)(Math.random()*100);
			
			if(mas[i]>max) {
				max=mas[i];
				ma=max;
				a=i;
				
			}
			if(mas[i]<min) {
				min=mas[i];
				mi=min;
				b=i;
			}
		}
		
		
		for(int i=0; i<mas.length; i++) {
			System.out.println(mas[i]);
		}
		
		
		System.out.println("max="+ma);
		System.out.println("min="+mi);
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		v=mas[a];
		System.out.println("mas[a]="+mas[a]);
		System.out.println("v="+v);	
		System.out.println("mas[b]="+mas[b]);
		mas[a]=mas[b];
		mas[b]=v;
		
		for(int i=0; i<mas.length; i++) {
			System.out.println(mas[i]);
		}
		
		
	}

}
