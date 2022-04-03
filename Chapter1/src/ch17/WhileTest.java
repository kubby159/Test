package ch17;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1;
		int sum = 0;
		while (num <= 10) {
			sum += num;
			num++;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
