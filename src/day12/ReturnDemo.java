package day12;

public class ReturnDemo {

	public static void main(String[] args) {
		int ans=test();
		System.out.println(ans);
	}

	private static int test() {
		int age = 63;

		if (age >= 70)
			return 1;
		else if (age >= 50)
			return 2;
		else if (age >= 30)
			return 3;
		else
			return 4;
	}

}
