package ch06;

public class StudentTest {

	public static void main(String[] args) {

		Student studentKim = new Student();
		
		// ���� ���� ������ ��������� �ڵ����� �ʱ�ȭ�� �� (null, 0)
		// ���������� �ڵ����� �ʱ�ȭ �ȵ�.
		System.out.println(studentKim.showStudentInfo());
	
		Student studentLee = new Student(123456, "�̿���", 4);
		System.out.println(studentLee.showStudentInfo());
	}

}
