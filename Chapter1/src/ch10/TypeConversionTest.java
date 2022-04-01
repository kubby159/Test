package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {

		/*
		 * byte bNum = 125; // int iNum = bNum; // System.out.println(iNum);
		 * 
		 * double dNum = 3.14; int iNum = (int)dNum; System.out.println();
		 */
		
		double dNum = 1.2;
		float fNum = 0.9f;
		int iNum = (int)dNum + (int)fNum; //1
		int iNum2 = (int)(dNum+ fNum); //2
		System.out.println(iNum);
		System.out.println(iNum2);
		
	}

}
