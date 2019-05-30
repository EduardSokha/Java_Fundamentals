package java_fundamentals.section_6;

public class Number19 {
	public static void main (String [] args) {
		int[][] mas=new int[5][8];
		int g=0;
		int q=0;
		int h=4;
		
		for(int i=0; i<mas.length-q; i++) {
			for(int j=q; j<mas[i].length-q; j++) {
				mas[g][j]=1;
				mas[h][j]=1;
//				mas[i][1]=1;				
//				mas[i][6]=1;
			}
//			mas[i][i]=g;
			System.out.println("before q= "+q);
			System.out.println("--------------------");
			++g;
//			if(q>-1 && q<2) {
				++q;
//			}else {
//				q=0;
//			}
			--h;
		
			
			System.out.println(" q= "+q);
		}
		for(int i=0; i<mas.length; i++) {
			for(int j=0; j<mas[i].length; j++) {
				System.out.printf("%-4d",mas[i][j]);			
			}	
			System.out.println();	
		}
		

}

}
