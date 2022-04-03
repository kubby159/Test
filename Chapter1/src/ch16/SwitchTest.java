package ch16;

import java.util.Scanner;

public class SwitchTest {
	// 자바 14부터 지원함.
//	yield 키워드는 항상 Switch 블록 내부에서만 사용된다.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();

		int day = switch (month) {
		case 1, 3, 5, 7, 8, 10, 12 -> 31;
		case 2 -> 28;
		case 4, 6, 9, 11 -> 30;
		default -> {
			System.out.println("존재하지 않는 달입니다.");
			yield -1;
		}
		};
		System.out.println(month + "월은" + day + "일 입니다.");

	}

}
