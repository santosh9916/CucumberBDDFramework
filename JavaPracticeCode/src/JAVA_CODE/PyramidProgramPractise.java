package JAVA_CODE;

public class PyramidProgramPractise {


	public void f() {
		int n = 5;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	

/*	*
	* *
	* * *
	* * * *
*/
	public void f2() {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}
	

/*	* * * *
	* * *
	* * 
	* 
*/
	public void f3() {
		int n = 5;
		for (int i = 1; i < n; i++) {
			for (int j = n-1; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}
	

	/*	    * 
		  * * * 
	    * * * * * 
	  *	* * * * * * 
	*/
		public void f4() {
			int n = 4;
			for (int i = 1; i <= n; i++) {
				for (int j = 4; j >= i; j--) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print("*");
				}
				for (int l = 2; l <= i; l++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	

}
