package JAVA_CODE;

public class Print_StringDifferentiate {
	public static void m1() {
		String[] str = { "abc@gmail.com", "def@gmail.com", "klm@apple.com",  "xyz@gmail.com", "mnp@apple.com" };
		System.out.println(str.length);
		for (int i = 0; i < str.length; i++) {
			if (str[i].contains("@gmail.com")) {
				System.out.println("gmail mails are::: " + str[i]);
			}
		}
		System.out.println("========================");
		for (int j = 0; j < str.length; j++) {
			if (str[j].contains("@apple.com")) {
				System.out.println("apple mails are::: " + str[j]);
			}
		}
	}

	public static void main(String[] args) {
		m1();
	}

}
