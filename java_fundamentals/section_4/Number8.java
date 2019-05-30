package java_fundamentals.section_4;

public class Number8 {
	public static void main (String [] args) {
		
		int[] mas=new int[7];	
		int max=1;
		int ma = 1;
		int min=80;
		int a=0;
		
		for(int i=0; i<mas.length; i++) {
			mas[i] = (int)(Math.random()*100);
			
			if(mas[i]>max) {
				max=mas[i];				
				a=i;				
			}
			
		}
		System.out.println("i="+a);		
		
		for(int i=0; i<mas.length; i++) {
			System.out.println(mas[i]);
		}
		
		
		System.out.println("max="+max);
		mas[a]=0;
		
		System.out.println("------------------------");
		for(int i=0; i<mas.length; i++) {
			System.out.println(mas[i]);
		}
		System.out.println("------------------------");		
		
		for(int i=0; i<mas.length; i++) {
			
			if(mas[i]>ma) {
				ma=mas[i];				
				a=i;				
			}
		}
		System.out.println("ma="+ma);
			
//		System.out.println("min="+mi);
//		System.out.println("a="+a);
//		System.out.println("b="+b);
//		
//		v=mas[a];
//		System.out.println("mas[a]="+mas[a]);
//		System.out.println("v="+v);	
//		System.out.println("mas[b]="+mas[b]);
//		mas[a]=mas[b];
//		mas[b]=v;
//		
//		for(int i=0; i<mas.length; i++) {
//			System.out.println(mas[i]);
//		}
//		
		
	}

}
