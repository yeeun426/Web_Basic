package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int day;
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day = 31;
				break;
			case 2: 
				day = 28;
				break;
			case 4: 
				day = 30;
				break;			
			case 6: 
				day = 30;
				break;
			case 9: 
				day = 30;
				break;
			case 11: 
				day = 30;
				break;
			default:
				System.out.println("존재하지 않는 달입니다.");
				day = -1;
		}
		System.out.println(month+"월은"+day+"일 입니다.");
	}

}

		// Java14 부터는
		// 쉼표(,)로 조건 구분 가능
		// 식으로 표현하여 반환 값을 받을 수 있음. 리턴 값이 없는 경우는 오류 발생
		// 반환값을 쓸 때는 yield 키워드 사용
