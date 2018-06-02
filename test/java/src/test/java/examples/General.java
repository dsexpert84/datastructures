
package src.test.java.examples;

/**
 * Using Generics
 * @author asharda
 *
 */

class Gen<T>
{
	T data;
	int i1;
	Gen(T i)
	{
		
		data=i;
	}
	
	public T getData()
	{
		return this.data;
	}
}
public class General {

	public static void main(String[] args) {

		General g=new General();
		Gen<Integer> g1=new Gen<Integer>(10);
		System.out.println(g1.getData());
		
	}

}
