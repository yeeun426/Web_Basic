package ch12;

public class LogicalTest {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i+2) < 10);

		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); //&&인 경우 num1에서 이미 false 이므로 i는 계산하지 않음
		
	}

}
