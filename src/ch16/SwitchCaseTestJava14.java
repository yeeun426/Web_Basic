package ch16;

import java.util.Scanner;

public class SwitchCaseTestJava14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int day = switch(month) {
		
			case 1,3,5,7,8,10,12 ->
				31;
			case 2-> 
				28;
			case 4,6,9,11 ->
				30;
			default-> {
				System.out.println("존재하지 않는 달입니다."); //수행하는 부분
				yield -1;  // 반환하는 부분
				// 수행하는 부분과 반환하는 부분을 같이 사용할 수 없음
				// 반환값이 따로 있음을 나타냄 = yield
			}
		}; // int day의 마지막에 세미콜론
		System.out.println(month+"월은 "+day+"일 입니다.");
	}
			// Java14 부터는
			// 쉼표(,)로 조건 구분 가능
			// 식으로 표현하여 반환 값을 받을 수 있음. 리턴 값이 없는 경우는 오류 발생
			// 반환값을 쓸 때는 yield 키워드 사용
}
