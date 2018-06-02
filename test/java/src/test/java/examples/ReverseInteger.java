package src.test.java.examples;

public class ReverseInteger {

	public int reverse(int x)
	{
		boolean flag=false;
		int out = 0;
		
		try
		{
		if(x==0)
		{
			return 0;
		}
		if(x<0)
		{
			x=Math.abs(x);
			flag=true;
		}
		String remainder="";
		while(x!=0)
		{
			remainder=remainder+x%10;
			x=x/10;
		}
		
		out=Integer.valueOf(remainder);
		if(out>Integer.MAX_VALUE)
		{
			return 0;
		}
		if(flag)
		{
			out=out*-1;
		}
		
		}
		catch(Exception e )
		{
			System.out.println("Number is greater or smaller");
			//e.printStackTrace();
		}
		return out;
	}
	public static void main(String[] args) {

		ReverseInteger r=new ReverseInteger();
		System.out.println(r.reverse(1534236469));
	}

}
