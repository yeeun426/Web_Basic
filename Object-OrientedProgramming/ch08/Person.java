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
		return "Ű�� " + personHeight + "�̰� �����԰� " + personWeight + "ų���� " + gender + "�� �ֽ��ϴ�. �̸��� " + name + "�̰� ���̴� " + personAge + "���Դϴ�.";
	}
	
}
