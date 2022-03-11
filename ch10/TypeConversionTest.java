package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {

		int iNum = 255;
		byte bNum = (byte)iNum;
		
		System.out.println(bNum);
		//자료에 문제가 생겨도 그냥 쓰겠다
		
		double cNum = 3.14;
		int inum = (int) cNum;
		
		System.out.println(inum);
		
		double dNum = 1.2;
		float fNum = 0.9f;
		
		int iNum1 = (int)dNum + (int)fNum;
		int iNum2 = (int)(dNum + fNum);
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		int myNum = 10;
		int yourNum = 20;
		
		myNum = myNum + yourNum;
		System.out.println(myNum);
	
	}

}
