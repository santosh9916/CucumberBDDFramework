package JAVA_CODE;

public class Swapwithout3rdVaribale {
	int a = 10, b = 20;

	public void swapVaribale() {
		if (a < b) {
			a = a + b;
			b = a - b;
			a = a - b;
			System.out.println("a="+a + ";b="+b);
		}
	}

	public static void main(String[] args) {
		Swapwithout3rdVaribale swap = new Swapwithout3rdVaribale();
		swap.swapVaribale();

	}

}
