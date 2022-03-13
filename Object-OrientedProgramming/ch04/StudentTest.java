package ch04;

public class StudentTest {

	public static void main(String[] args) {

		//학생 한명 생성 -> student라는 클래스에서 하나의 인스턴스 (heap memory)
		//studentLee -> 참조변수
		Student studentLee = new Student();
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee yeeun");
		studentLee.address = "인천 남동구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "경기도 성남시";
		
		studentKim.showStudentInfo();
	}

}
