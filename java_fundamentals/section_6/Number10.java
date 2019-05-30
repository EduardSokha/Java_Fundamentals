package java_fundamentals.section_6;

public class Number10 {
	
	public static void main (String [] args) {
		int[][] mas=new int[5][5];
		int k = 2;
		int p = 2;
		
		for(int i=0; i<mas.length; i++) {
			for(int j=0; j<mas[i].length; j++) {
				
					mas[i][j]=(int)(Math.random()*100);	
				
			
				
				//mas[i][j]=(int)(Math.random()*100);				
			}
			//mas[i][i]=1;
		}
		for(int i=0; i<mas.length; i++) {
			for(int j=0; j<mas[i].length; j++) {
				System.out.printf("%-5d",mas[i][j]);			
			}	
			System.out.println();	
		}
		System.out.println("---------------------");
		
		
		for(int i=0; i<mas.length; i++) {
			
			for(int j=0; j<mas[i].length; j++) {				
					if(j==p) {
					System.out.printf("%-4d",mas[i][j]);
										
					}
					if(i==k) {
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
