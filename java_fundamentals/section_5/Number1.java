package java_fundamentals.section_5;

public class Number1 {
	public static void main (String [] args) {
		int[] mas=new int[7];
		int z=0;
		for(int i=0; i<mas.length; i++) {
			mas[i] = (int)(Math.random()*100);
			if(mas[i]%5==0) {
				z+=mas[i];
			}
		}
		System.out.println("z="+z);
		for(int i=0; i<mas.length; i++) {
			System.out.println(mas[i]);
		}
		
	}

}
