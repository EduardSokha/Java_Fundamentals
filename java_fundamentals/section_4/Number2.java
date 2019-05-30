package java_fundamentals.section_4;

import java.util.Scanner;

public class Number2 {
	public static void main (String [] args) {
		int a=enter("enter A");
		int b=enter("enter B");
		
		int nod=nod(a,b);
		System.out.println("nod="+nod);
		int nok=nok(nod,a,b);
		System.out.println("nok="+nok);
	}
	
	
	public static int enter (String message ) {
		Scanner sc = new Scanner(System.in);
		int c;
		System.out.println(message);
		
		while(sc.hasNextInt()==false) {
			String s = sc.next();
			System.out.println("not int");
			System.out.println("enter int");
		}
		c=sc.nextInt();
		return c;
	}
	
	
	public static int nok (int nod, int aa, int bb) {
		int a=aa;
		int b=bb;
		int nodd=nod;
		int nokk=(a*b)/nodd;
		return nokk;
	}
	
	public static int nod (int aaa, int bbb) {
		int[] masforA=new int[10];
		int[] masforB=new int[10];
		int[] masNOD=new int[9];
		int a=aaa;
		int b=bbb;
		int k=0;
		int m=0;
		int w=0;
		int NOD=1;
		int NOK=0;
		
		for(int i=0; i<masforA.length; i++) {
			if(a%2==0) {
				masforA[i]=2;
				a=a/2;
				continue;
			}
			if(a%3==0) {
				masforA[i]=3;
				a=a/3;
				continue;
			}
			if(a%5==0) {
				masforA[i]=5;
				a=a/5;
				continue;
			}
			if(a%7==0) {
				masforA[i]=7;
				a=a/7;
				continue;
			}
			if(a%2!=0 && a%3!=0 && a%5!=0 && a%7!=0) {
				masforA[i]=a;
				masforA[i+1]=1;
				
				
				break;
			}
		}
			
			for(int i=0; i<masforB.length; i++) {
				if(b%2==0) {
					masforB[i]=2;
					b=b/2;
					continue;
				}
				if(b%3==0) {
					masforB[i]=3;
					b=b/3;
					continue;
				}
				if(b%5==0) {
					masforB[i]=5;
					b=b/5;
					continue;
				}
				if(b%7==0) {
					masforB[i]=7;
					b=b/7;
					continue;
				}
				if(b%2!=0 && b%3!=0 && b%5!=0 && b%7!=0) {
					masforB[i]=b;
					break;
				}			
		}
//		System.out.println("-------------------------");
//		for(int i=0; i<masforA.length; i++) {
//			System.out.println(masforA[i]);
//		}
//		System.out.println("-------------------------");
//		for(int i=0; i<masforB.length; i++) {
//			System.out.println(masforB[i]);
//			}
//		System.out.println("-------------------------");
			
			
			for(int i=0; i<masforA.length; i++) {
				m=i;
//				System.out.println("A"+masforA[i]);
				
				for(int j=w; j<masforB.length; j++) {
					if(masforA[m]==0) {
						break;
					}
//					System.out.println("B"+masforA[j]);
					if(masforA[m]== masforB[j]) {
						int q=masforA[m];
						masNOD[k]= q;
						++k;
//						System.out.println("k="+k);
						masforB[j]=0;
//						w=j+1;
//						System.out.println("w="+w);
						break;
					}
					
				}
				if(masforA[i]==0) {
					break;
				}
			}
			
			
	
//		System.out.println("-------------------------");
//		for(int i=0; i<masNOD.length; i++) {
//			System.out.println(masNOD[i]);
//			}	
//		
//		System.out.println("-------------------------");
//		for(int i=0; i<masforA.length; i++) {
//		System.out.println(masforA[i]);
//	}
//		System.out.println("-------------------------");
//		for(int i=0; i<masforB.length; i++) {
//			System.out.println(masforB[i]);
//			}
//		System.out.println("-------------------------");
//		
//		System.out.println("-------------------------");
		
		for(int i=0; i<masNOD.length; i++) {
			if(masNOD[i]==0) {
				break;
			}
			NOD*=masNOD[i];			
			}	
//		System.out.println("NOD="+NOD);
		NOK=nok(NOD,a,b);
		return NOD; 
		//return NOK;
		
	}

}
