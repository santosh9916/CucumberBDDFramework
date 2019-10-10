package JavaLogicPractice;

import JAVA_CODE.Number_Palindrome;

public class NumerPalindrome {

	
	public void palindromeNum(int num) {
		int num1 = num;
		int newNum = 0;	
		int revNum;
		while(num > 0) {
			revNum = num%10;
			newNum = newNum * 10 + revNum;
			num = num / 10;
		}
		if(num1 == newNum) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		NumerPalindrome n1 = new NumerPalindrome();
		n1.palindromeNum(121);

	}

}
