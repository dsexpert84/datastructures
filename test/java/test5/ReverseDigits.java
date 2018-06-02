package test5;

public class ReverseDigits {

public int reverse(int x) {
 	String remainder="";
	while(x !=0)
	{
		int num=x%10;
		remainder=remainder+num;
		x=x/10;
		
	}
	return Integer.parseInt(remainder);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseDigits d=new ReverseDigits();
		System.out.println(d.reverse(123));

	}

}
