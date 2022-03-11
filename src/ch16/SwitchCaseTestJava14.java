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
				System.out.println("�������� �ʴ� ���Դϴ�."); //�����ϴ� �κ�
				yield -1;  // ��ȯ�ϴ� �κ�
				// �����ϴ� �κа� ��ȯ�ϴ� �κ��� ���� ����� �� ����
				// ��ȯ���� ���� ������ ��Ÿ�� = yield
			}
		}; // int day�� �������� �����ݷ�
		System.out.println(month+"���� "+day+"�� �Դϴ�.");
	}
			// Java14 ���ʹ�
			// ��ǥ(,)�� ���� ���� ����
			// ������ ǥ���Ͽ� ��ȯ ���� ���� �� ����. ���� ���� ���� ���� ���� �߻�
			// ��ȯ���� �� ���� yield Ű���� ���
}
