
package src.test.java.examples;

/**
 * @author asharda
 *
 */

interface MyNumber
{
	boolean test(int n);
	//int getValues();
	
}
public class Rotate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l=12345678;
		System.out.println(Long.rotateLeft(l, 2));
		//System.out.println(()->123.45));
		MyNumber myNum;
		myNum = (n) -> (n%2)==0;
		System.out.println(myNum.test(13));
		//Long.rotateLeft(l, 2);
	}

}
