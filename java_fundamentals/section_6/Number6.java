package java_fundamentals.section_6;

public class Number6 {
	public static void main (String [] args) {
		int[][] mas=new int[7][7];
		
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
				//if(mas[i][0]>(mas[i][6]) && i%2!=0) {
					if(mas[0][j]>(mas[6][j]) && j%2!=0) {
					System.out.printf("%-4d",mas[i][j]);
					}
//				if(i==mas.length-1) {
//					System.out.printf("%-4d",mas[i][j]);
//				}
			}	
			System.out.println();	
		}
		
	}

}
