package JAVA_CODE;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Occurance_Of_Integer_Array {

	public static void m2() {
		int[] num = { 1, 2,2,2,2, 1, 3, 5, 6, 4, 5,2,5, 6, 8, 5 };
		int[] count = new int[10];
		int i, temp = 0;
		for (i = 0; i < num.length; i++) {
			if (num[i] == 0) {
				break;
			}
		}
		for (i = 0; i < num.length; i++) {
			temp = num[i];
			count[temp]++;
		}
		for (i = 1; i < count.length; i++) {
			if (count[i] > 0 && count[i] == 1) {
				System.out.printf("%d occurs %d time\n", i, count[i]);
			} else if (count[i] >= 2) {
				System.out.printf("%d occurs %d times\n", i, count[i]);
			}
		}
	}

	public static void m4() {
		int[] input = new int[] { 1, 4, 5, 2, 2, 2, 3, 5, 1, 6, 4, 7, 1, 3, 6, 8, 2, 5 };
		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < input.length; i++) {
			int key = input[i];
			if (countMap.containsKey(key)) {
				int count = countMap.get(key);
				count++;
				countMap.put(key, count);
			} else {
				countMap.put(key, 1);
			}
		}
		for (Entry<Integer, Integer> val : countMap.entrySet()) {
			System.out.println(val.getKey() + " occurs " + val.getValue() + " time(s)");
		}
	}

	public static void m5() {
		int[] input = new int[] { 1, 4, 5, 2, 2, 3, 5, 1, 6, 4, 7, 1, 3, 6, 8, 2, 5, 8, 2, 5, 2, 5, 8, 2, 5, 2, 5, 8, 2,
				5 };
		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();

		for (int num : input)
			if (countMap.containsKey(num)) {
				countMap.put(num, countMap.get(num) + 1);
			} else {
				countMap.put(num, 1);
			}
		for (Entry<Integer, Integer> val : countMap.entrySet()) {
			System.out.println(val.getKey() + " occurs " + val.getValue() + " time(s)");
		}
	}

	public static void test() {
		int[] input = new int[] { 1, 4, 5, 2, 2, 3, 5, 1, 6, 2, 5, 2, 5, 8, 2, 5, 2, 5, 8, 2, 5 };
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			for (int j = 1; j < input.length; j++) {
				if (input[i] == input[j]) {
					count = input[i]++;
				} else {
					System.out.println(count = 1);
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// Occurance_Of_Integer_Array.m1();
		Occurance_Of_Integer_Array.m2();
		// Occurance_Of_Integer_Array.m3();
		// Occurance_Of_Integer_Array.m4();
		// Occurance_Of_Integer_Array.m5();
		// Occurance_Of_Integer_Array.test();
	}

}
