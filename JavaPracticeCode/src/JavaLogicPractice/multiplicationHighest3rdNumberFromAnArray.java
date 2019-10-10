package JavaLogicPractice;

public class multiplicationHighest3rdNumberFromAnArray {

	int[] num = { -55, 3, 1, 9, 4, -8, 7, 0, 9 };
	
	public void m1() {
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					num[i] = num[i] + num[j];
					num[j] = num[i] - num[j];
					num[i] = num[i] - num[j];
				}
			}
			System.out.print(num[i] + "  ");
		}
		System.out.print("num size: "+num.length);
		int num1=1;
		for (int k = num.length - 1; k > (num.length - 1) - 3; k--) {
			num1 = num[k]*num1;
		}
		System.out.print("Values: "+num1);
	}

	public static void main(String[] args) {
		multiplicationHighest3rdNumberFromAnArray mul = new multiplicationHighest3rdNumberFromAnArray();
		mul.m1();

	}

}
