package src.test.java.examples;

public class Dividend {

	public int divide(int dividend, int divisor) {
		int count = 0;
		boolean flag = false;
		if (dividend < 0 && divisor > 0) {
			flag = true;
		}

		else if (dividend > 0 && divisor < 0) {
			flag = true;
		}

		else if (dividend < 0 && divisor < 0) {
			flag = false;
		}
		if (dividend == -2147483648) {
			dividend = -2147483647;
		}
		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);
		while (dividend >= divisor) {
			dividend = dividend - divisor;
			count++;
		}

		if (flag) {
			count = count * -1;
		}

		return count;
	}

	public static void main(String[] args) {

		Dividend d = new Dividend();
		System.out.println(d.divide(-2147483648, -1));
	}

}
