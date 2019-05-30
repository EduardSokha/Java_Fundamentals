package java_fundamentals.section_6;

public class Number4 {
	public static void main (String [] args) {
		int[][] mas=new int[3][4];
		
		for(int i=0; i<mas.length; i++) {
			for(int j=0; j<mas[i].length; j++) {
				mas[i][j]=(int)(Math.random()*100);				
			}
			mas[i][i]=1;
		}
		for(int i=0; i<mas.length; i++) {
			for(int j=0; j<mas[i].length; j++) {
				System.out.printf("%-4d",mas[i][j]);			
			}	
			System.out.println();	
		}
		System.out.println("----------------");
		for(int i=0; i<mas.length; i++) {
			for(int j=0; j<mas[i].length; j++) {
				if(i==0) {
				System.out.printf("%-4d",mas[i][j]);
				}
				if(i==mas.length-1) {
					System.out.printf("%-4d",mas[i][j]);
				}
			}	
			System.out.println();	
		}
		
	}

	

}
