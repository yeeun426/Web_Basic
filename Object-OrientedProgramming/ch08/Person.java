package ch08;

public class Person {

	public int personHeight;
	public int personWeight;
	public String gender;
	public String name;
	public int personAge;
	
	public Person(int personHeight, int personWeight, String gender, String name, int personAge) {

		this.personHeight = personHeight;
		this.personWeight = personWeight;
		this.gender = gender;
		this.name = name;
		this.personAge = personAge;
	}
	
	public String showPersonInfo() {
		return "키가 " + personHeight + "이고 몸무게가 " + personWeight + "킬로인 " + gender + "이 있습니다. 이름은 " + name + "이고 나이는 " + personAge + "세입니다.";
	}
	
}
