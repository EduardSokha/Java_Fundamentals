package java_fundamentals.section_6;

public class Number3 {
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
				if(j==0) {
				System.out.printf("%-4d",mas[i][j]);
				}
				if(j==mas.length) {
					System.out.printf("%-4d",mas[i][j]);
				}
			}	
			System.out.println();	
		}
		
	}

}
