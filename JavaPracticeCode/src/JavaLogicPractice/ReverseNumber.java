package JavaLogicPractice;

public class ReverseNumber {

	public void revNum(int num) {
		int revnumber;
		while (num > 0) {
			revnumber = num % 10;
			num = num / 10;
			System.out.print(revnumber);
		}
	}

	public static void main(String[] args) {
		ReverseNumber n = new ReverseNumber();
		n.revNum(1234);

	}

}
