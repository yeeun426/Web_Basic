package ch08;

public class CharaterTest {

	public static void main(String[] args) {

		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;   //음수는 들어갈 수 없음
		System.out.println(ch2);
		System.out.println((char)ch2);

		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		char han = '한';
		char ch = '\uD55C'; //유니코드
		
		System.out.println(han);
		System.out.println(ch);
	}

}
