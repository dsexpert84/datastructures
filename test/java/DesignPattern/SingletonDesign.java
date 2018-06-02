package DesignPattern;

/**Singleton Design Pattern
 * @author asharda
 *
 */

class Singleton
{
	private static Singleton instance =new Singleton();
	private Singleton()
	{
		
	}
	public static Singleton getInstance()
	{
		return instance;
	}
	
	public String getMessage()
	{
		return "Hello World";
	}
}
public class SingletonDesign {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton s=Singleton.getInstance();
		System.out.println(s.getMessage());

	}

}
