package JAVA_CODE;

public class Print_ReverseNumber {
	public static void m1(int num) {
		int revNum;
		while(num>0) {
			revNum= num % 10;
			num = num/10;
			System.out.print(revNum);
		}
	}

	public static void main(String[] args) {
		Print_ReverseNumber.m1(123456);

	}

}
