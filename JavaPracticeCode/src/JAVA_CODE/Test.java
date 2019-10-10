package JAVA_CODE;

import java.util.Arrays;
import java.util.Collections;

public class Test {
	
	

	public void dscOrder(Integer[] nums) {
		Collections.reverse(Arrays.asList(nums));
		System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {
		Integer[] num = { 80, 40, 30, 20, 10, 70, 60, 50, 90 };
		Test t = new Test();
		t.dscOrder(num);

	}

}
