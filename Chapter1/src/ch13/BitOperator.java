package ch13;

public class BitOperator {

	public static void main(String[] args) {
		
		
		int num1 = 5; //00000101
		int num2 = 10;//00001010
		
		System.out.println(num1 | num2);
		System.out.println(num1 & num2);
		System.out.println(num1 ^ num2);
		System.out.println(~num1);
		
		System.out.println(num1<<2);
		System.out.println(num1<<=2);
		System.out.println(num1 >> 1); //비트연산자는 immutable 성격을 가지고 있어서 데이터 값을 바꾸고 싶을 때 대입을 해서 바꿔야한다.
		
		
		
	}
	
	

}
