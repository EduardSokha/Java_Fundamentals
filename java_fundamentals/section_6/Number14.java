package java_fundamentals.section_6;

public class Number14 {
	public static void main (String [] args) {
		int[][] mas=new int[5][5];
		int g=0;
		int k=4;
		
		for(int i=0; i<mas.length; i++) {
			for(int j=0; j<mas[i].length; j++) {
//				mas[i][j]=(int)(Math.random()*100);
//				if(i%2==0) {
//					mas[i][j]=j+1;
//										
//					}
			}
			mas[i][k]=g;
			++g;
			--k;
		}
		for(int i=0; i<mas.length; i++) {
			for(int j=0; j<mas[i].length; j++) {
				System.out.printf("%-4d",mas[i][j]);			
			}	
			System.out.println();	
		}
		
	}

}
