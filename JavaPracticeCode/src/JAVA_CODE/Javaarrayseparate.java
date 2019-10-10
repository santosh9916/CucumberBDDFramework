package JAVA_CODE;

import java.util.ArrayList;
import java.util.List;

public class Javaarrayseparate {

	public void m1() {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] subArr = new int[3];
		int count = 0;
		List<int[]> list = new ArrayList<>();
		for (int k = 0; k < arr.length; k++) {
			if (count <= 2) {
				subArr[count++] = arr[k];
			} else {
				list.add(subArr);
				subArr = new int[3];
				count = 0;
				subArr[count++] = arr[k];
			}

			if (k == arr.length - 1) {
				list.add(subArr);
			}
		}
		System.out.println("list size: " + list.size());
		list.forEach(obj -> {
			int[] inrObjArr = obj;
			if (null != inrObjArr && inrObjArr.length > 0) {
				System.out.print(" { ");
				// System.out.println("New Array" + inrObjArr.length);
				for (int k = 0; k < inrObjArr.length; k++) {
					System.out.print(inrObjArr[k] + " ");
				}
				System.out.print(" } "+",");
				//System.out.println();
			}
		});
	}

	public static void main(String[] args) {
		Javaarrayseparate ref = new Javaarrayseparate();
		ref.m1();
	}

}
