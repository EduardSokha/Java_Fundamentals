package java_fundamentals.section_6;

public class Number17 {
	public static void main (String [] args) {
		int[][] mas=new int[5][5];
		int g=0;
		
		for(int i=0; i<mas.length; i++) {
			for(int j=0; j<mas[i].length; j++) {
				mas[0][j]=1;
				mas[i][0]=1;
				mas[4][j]=1;
				mas[i][4]=1;
			}
//			mas[i][i]=g;
//			++g;
		}
		for(int i=0; i<mas.length; i++) {
			for(int j=0; j<mas[i].length; j++) {
				System.out.printf("%-4d",mas[i][j]);			
			}	
			System.out.println();	
		}
		

}
}
