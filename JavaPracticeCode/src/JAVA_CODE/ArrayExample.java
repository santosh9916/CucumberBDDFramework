package JAVA_CODE;

public class ArrayExample {

	int[] ar1 = { 10, 20, 30, 40, 50 };
	int[] ar2 = { 30, 40, 50, 60 };
	int[] ar3 = { 10, 40, 50, 70 };

	public void m1() {
		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar2.length; j++) {
				if (ar1[i] == ar2[j]) {
					// System.out.print(ar1[i]);

					for (int j2 = 0; j2 < ar3.length; j2++) {
						if (ar1[i] == ar3[j2]) {

							System.out.print(ar1[i]+",");
						}
					}
				}
			}
		}

	}
	
	public void m3() {
		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar2.length; j++) {
				for (int j2 = 0; j2 < ar3.length; j2++) {
				if (ar1[i] == ar2[j] && ar2[j]== ar3[j2]){
							System.out.print(ar3[j2]+",");
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		ArrayExample arr = new ArrayExample();
		arr.m3();

	}
}