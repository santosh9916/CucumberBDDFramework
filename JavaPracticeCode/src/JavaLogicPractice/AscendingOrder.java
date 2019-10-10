package JavaLogicPractice;

import java.util.Arrays;

public class AscendingOrder {
	int[] num= {80,40,30,20,10,70,60,50,90};

	public void ascOrder() {
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(num[i] > num[j]) {
					num[i] = num[i]+num[j];
					num[j] = num[i]-num[j];
					num[i] = num[i]-num[j];
				}
			}
		}
		System.out.println(Arrays.toString(num));
	}

	public static void main(String[] args) {
		AscendingOrder asc=new AscendingOrder();
		asc.ascOrder();

	}

}
