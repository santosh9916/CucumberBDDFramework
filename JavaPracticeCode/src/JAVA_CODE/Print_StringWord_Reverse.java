package JAVA_CODE;

public class Print_StringWord_Reverse {
	
	public static void m1(String str) {
	
		char[] str1 = str.toCharArray();
		
		for (int i= str1.length-1; i>=0; i--) {
			System.out.print(str1[i]);
		}
	}
	public static void m2(String str) {
		
		for(int i = str.length()-1; i >= 0; i--) {
			char str1 = str.charAt(i);
			System.out.print(str1);
		}
		
	}

	public static void main(String[] args) {
		Print_StringWord_Reverse.m1("CONCENTRATION");
		Print_StringWord_Reverse.m2("CONCENTRATION");

	}
}
