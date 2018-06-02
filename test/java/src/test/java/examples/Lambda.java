
package src.test.java.examples;

/**
 * @author asharda
 *
 */

interface MyNumbers
{
	boolean test(int a,int b);
}
public class Lambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyNumbers num;
		num=(a,b) -> {
		if(a%b ==0)
		{
			return true;
		}
		else
		{
			return false;
		}
		};
		System.out.println(num.test(10, 2));
		
	}

}
