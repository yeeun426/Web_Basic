package ch06;

public class StudentTest {

	public static void main(String[] args) {

		Student studentKim = new Student();
		
		// 값을 주지 않으면 멤버변수는 자동으로 초기화가 됨 (null, 0)
		// 지역변수는 자동으로 초기화 안됨.
		System.out.println(studentKim.showStudentInfo());
	
		Student studentLee = new Student(123456, "이예은", 4);
		System.out.println(studentLee.showStudentInfo());
	}

}
