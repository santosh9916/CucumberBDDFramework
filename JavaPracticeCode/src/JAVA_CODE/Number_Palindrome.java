package JAVA_CODE;

public class Number_Palindrome {
	public static void m1(int num) {
		int num1 = num;
		int revNum;
		int newNum = 0;
		while (num > 0) {
			revNum = num % 10;
			newNum = newNum * 10 + revNum;
			num = num / 10;
		}
		if (num1 == newNum) {
			System.out.println(newNum + "is a Palindrome Number");
		} else {
			System.out.println(newNum + "is not a Palindrome Number");
		}
	}

	public static void m2(int num) {
		int reversedInteger = 0, remainder, originalInteger;
		originalInteger = num;

		while (num != 0) {
			remainder = num % 10;
			reversedInteger = reversedInteger * 10 + remainder;
			num /= 10;
		}
		if (originalInteger == reversedInteger)
			System.out.println(originalInteger + " is a palindrome.");
		else {
			System.out.println(originalInteger + " is not a palindrome.");
		}
	}

	public static void main(String[] args) {
		Number_Palindrome.m1(252);
		Number_Palindrome.m2(252);
	}

}
