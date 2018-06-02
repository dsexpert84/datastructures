package test6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class TriangleTest {

	public int minimumTotal(List<ArrayList<Integer>> list) {
		int mintotal=0;
		for(ArrayList l:list)
		{
			Collections.sort(l);
			mintotal=(int) l.get(0)+mintotal;
		}
		
		return mintotal;
	}

	@Test
	public void testTriangle()
	{

		List<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(2);
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(3);
		a2.add(4);
		ArrayList<Integer> a3=new ArrayList<Integer>();
		a3.add(6);
		a3.add(5);
		a3.add(7);
		ArrayList<Integer> a4=new ArrayList<Integer>();
		a4.add(4);
		a4.add(1);
		a4.add(8);
		a4.add(3);
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		TriangleTest test=new TriangleTest();
		System.out.println(test.minimumTotal(list));
		//test.minimumTotal(list);
	}
}
