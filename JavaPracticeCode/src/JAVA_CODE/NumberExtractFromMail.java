package JAVA_CODE;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExtractFromMail {
	String str = "AabcAbm112@gmail.com";
	String str1 = "2352146";
	public void m1() {
		 Matcher b2 = Pattern.compile(str).matcher("112");
		 System.out.println(b2);
	}
	public void m2() {
		 String	numbers = str.replaceAll("[^0-9]", "");
		 System.out.println(numbers);
	}
	public void m3() {
		 String	numbers = str.replaceAll("[A{n,}", "");
		 System.out.println(numbers);
	}
	public void m4() {
		 String	numbers = str.replaceAll("[^-0--9]", "");
		 System.out.println(numbers);
	}
	public void m5() {
		 boolean	numbers = str1.matches("(\\d+)");
		 System.out.println(numbers);
	}
	public static void main(String[] args) {
		NumberExtractFromMail n = new NumberExtractFromMail();
		n.m5();

	}

}
