package ch03;

public class FunctionTest {

	// 1. 매개변수 O 반환값 O
	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	// 2. 매개변수 O 반환값 X
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	// 3. 매개변수 X 반환값 O
	public static int calcSum() {
		int sum = 0;
		int i;
		
		for(i = 0; i<=100; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {

		int n1  = 10;
		int n2 = 20;
		
		int total = addNum(n1,n2);
		System.out.println(total);
		
		sayHello("안녕");
		
		total = calcSum();
		System.out.println(total);
	}

}
