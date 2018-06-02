package test5;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Random;

import org.testng.annotations.Test;

public class HashMapTest {

	@Test
	public void testMap()
	{
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		hm.put(0, 10);
		hm.put(1, 20);
		hm.remove(0);
		Random r=new Random();
		System.out.println("After shuffling number seen is " +hm.get(r.nextInt(hm.entrySet().iterator().next().getKey())));
		Integer r1=hm.get(r.nextInt(hm.entrySet().iterator().next().getKey()));
		System.out.println(r1);
		
		
	}
}
