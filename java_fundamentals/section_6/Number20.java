package java_fundamentals.section_6;

public class Number20 {
	public static void main (String [] args) {
		int[][] mas=new int[6][6];
		int g=0;
		int q=0;
		int h=1;
		int y=5;
		
		for(int i=0; i<mas.length; i++) {
			for(int j=0; j<mas[i].length; j++) {
//				mas[g][j]=1;
//				mas[h][j]=1;
				mas[i][y]=1;				
				mas[i][g]=1;
				if(i>0 && i<5) {	
					mas[h][0]=1;
					mas[h][1]=1;
					mas[h][4]=1;
					mas[h][5]=1;
					++h;
				}
				
				if(j==0) {					
					break;
				}
				if(j==7) {					
					break;
				}				
			}
			--y;
			++g;
			++q;
			System.out.println("before q= "+q);
			System.out.println("--------------------");				
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
