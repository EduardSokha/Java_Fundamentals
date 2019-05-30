/**
 * 
 */
package java_fundamentals.first_20_tasks;

/**
 * @author Eduard
 *
 */
public class number5 {

	public static void main (String[] args) {
		int n = 1;
		int b = 0;
		while (n<5) {
		int	x =(int) (Math.random()*100);
		//System.out.println(x);
		b += x;
		n++;
		}
		System.out.println(b);
		System.out.println(n);
		double z = b/(n-1);
		System.out.println(z);
	}
	
	
}
