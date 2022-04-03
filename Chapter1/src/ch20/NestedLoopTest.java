package ch20;

public class NestedLoopTest {

	public static void main(String[] args) {

//		for (int i = 1; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + "X" + j + '=' + i * j);
//			}
//			System.out.println();
//		}
		int i = 2;
		int j = 1;
		while (i <= 9) {
			j = 1;
			while (j <= 9) {

				System.out.println(i + "X" + j);
				j++;

			}
			i += 1;

		}
	}

}
