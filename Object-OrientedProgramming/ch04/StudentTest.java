package ch04;

public class StudentTest {

	public static void main(String[] args) {

		//�л� �Ѹ� ���� -> student��� Ŭ�������� �ϳ��� �ν��Ͻ� (heap memory)
		//studentLee -> ��������
		Student studentLee = new Student();
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee yeeun");
		studentLee.address = "��õ ������";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "��⵵ ������";
		
		studentKim.showStudentInfo();
	}

}
