package test5;

public class Factorial {

	public int fact(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
			return fact(n-1)*n;
	}
	public static void main(String[] args) {

		Factorial f=new Factorial();
		System.out.println(f.fact(3));

	}

}
