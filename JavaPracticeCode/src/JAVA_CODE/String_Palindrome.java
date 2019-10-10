package JAVA_CODE;

public class String_Palindrome {
	public static void m1(String str) {
		String str1="";
		for (int i = str.length() - 1; i >= 0; i--) {
			str1=str1+str.charAt(i);
			//System.out.println(ch1);
		}
		if (str.equals(str1)) {
			System.out.println(str + str1 + ":::Palindrome");
		} else {
			System.out.println(str + str1 + "::: Not Palindrome");
		}

	}

	public static void main(String[] args) {

		String_Palindrome.m1("abcba");
	}

}
