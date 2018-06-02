package src.test.java.examples;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author asharda
 *
 */
public class Streams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<Integer> ();
		list.add(10);
		list.add(7);
		list.add(3);
		list.add(15);
		Stream<Integer> stream=list.stream().sorted().filter((n) -> (n%2)==1).filter((n) -> n>5);
		Optional<Integer> min=stream.min(Integer::compare);
		//Optional<Integer> max=stream.max(Integer::compare);
		//System.out.println("Minimum value seen is "+min.get());
		//System.out.println("Maximum value seen is "+max.get());
		stream.forEach((n) -> System.out.println(n + " "));
		

	}

}
