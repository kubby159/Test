package ch21;

public class ContinueTest {

	public static void main(String[] args) {

		int num;
		for (num = 1; num <= 100; num++) {

			if (num % 2 == 1)
				continue;

			System.out.println(num);
		}
	}

}
