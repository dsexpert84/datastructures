package test5;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Solution
 * @author asharda
 *
 */
public class PhoneCombination {

	public List<String> letterCombinations(String digits) {
		LinkedList<String> ans = new LinkedList<String>();
		HashMap<Character,String> hm=new HashMap<Character,String>();
		hm.put('0', "0");
		hm.put('1', "1");
		hm.put('2', "abc");
		hm.put('3', "def");
		char t[]=digits.toCharArray();
		int i=0;
		while(i+1<digits.length())
		{
			ans=combine(hm.get(t[i]),hm.get(t[i+1]));
			i++;
		}
		return ans;
	}
	
	public LinkedList<String> combine(String s,String t)
	{
		LinkedList<String> list=new LinkedList<String>();
		char []s1=s.toCharArray();
		char []t1=t.toCharArray();
		for(int i=0;i<s1.length;i++)
		{
			for(int j=0;j<t1.length;j++)
			{
				String temp=Character.toString(s1[i]) + Character.toString(t1[j]);
				list.add(temp);
			}
				
		}
		return list;
		
	}
	public static void main(String[] args) {
		
		PhoneCombination p=new PhoneCombination();
		List<String> list=p.letterCombinations("123");
		for(String s:list)
		{
			System.out.println(s);
		}
		
		
	}

}
