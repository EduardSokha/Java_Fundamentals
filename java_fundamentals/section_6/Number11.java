package java_fundamentals.section_6;

public class Number11 {
	public static void main (String [] args) {
		int[][] mas=new int[5][5];
		int[][] mas2=new int[5][5];
		int q = 4;
		int f = 0;
		
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
				if(i%2!=0) {
//					for(int g=mas[i].length-1; g>-1; --g) {
//						System.out.println(g);	
//						mas[i][j]=mas[i][g];
//					}
//					f=mas[i][q];
//					System.out.println("f="+f);					
//					mas[i][j]=f;
					System.out.print("q="+q);
					mas2[i][q]=mas[i][j];
					if(q==0) {
						q=4;
						continue;
					}
					--q;				
				}				
			}	
			System.out.println();	
		}
		System.out.println("---------------------");
		
		for(int i=0; i<mas.length; i++) {
			for(int j=0; j<mas[i].length; j++) {
				System.out.printf("%-5d",mas[i][j]);			
			}	
			System.out.println();	
		}
		System.out.println("---------------------");
		
		for(int i=0; i<mas2.length; i++) {
			for(int j=0; j<mas2[i].length; j++) {
				System.out.printf("%-5d",mas2[i][j]);			
			}	
			System.out.println();	
		}
		System.out.println("---------------------");
		
		
		for(int i=0; i<mas.length; i++) {
			for(int j=0; j<mas[i].length; j++) {
				
					if(i%2!=0) {
//						for(int g=mas[i].length-1; g>-1; --g) {
//							System.out.println(g);	
//							mas[i][j]=mas[i][g];
//						}
//						f=mas[i][q];
//						System.out.println("f="+f);
//						System.out.print("q="+q);
						mas[i][j]=mas2[i][j];
							
					}
					System.out.printf("%-5d",mas[i][j]);
//				if(i==mas.length-1) {
//					System.out.printf("%-4d",mas[i][j]);
//				}
			}	
			System.out.println();	
		}
		System.out.println("---------------------");
		
	}


}
