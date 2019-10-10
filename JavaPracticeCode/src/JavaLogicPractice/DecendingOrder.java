package JavaLogicPractice;

import java.util.Arrays;

public class DecendingOrder {
	int[] num = { 80, 40, 30, 20, 10, 70, 60, 50, 90 };
	String arr;
	public void dscOrder() {
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] < num[j]) {
					num[i] = num[i] + num[j];
					num[j] = num[i] - num[j];
					num[i] = num[i] - num[j];
				}
			}
		}
		arr = Arrays.toString(num);
		System.out.println(Arrays.toString(num));
	}

	public static void main(String[] args) {

		DecendingOrder d = new DecendingOrder();
		d.dscOrder();
	}

}
