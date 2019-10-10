package JAVA_CODE;

public class Swaping_Strings {
	String a = "santosh", b = "mohanty";

	public void swapingStringswithOutUsingThirdVaribal() {
		a = a + b;
		
		b = a.substring(0, a.length() - b.length()); 
		
        a = a.substring(b.length());  
        
        System.out.println("After : " + a + " " + b);
	}
	public void swapingStringsUsingThirdVaribal() {
		String s  = a + b;
		
		b = s.substring(0, s.length() - b.length()); 
		
        a = s.substring(b.length());  
        
        System.out.println("After : " + a + " " + b);
	}
	public static void main(String[] args) {
		Swaping_Strings swaping = new Swaping_Strings();
		//swaping.swapingStringswithOutUsingThirdVaribal();
		swaping.swapingStringsUsingThirdVaribal();
	}

}
