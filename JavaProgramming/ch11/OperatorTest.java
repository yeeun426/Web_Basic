package ch11;

public class OperatorTest {
	public static void main(String[] args) {

		int gameScore = 150;
		
		int lastScore = gameScore++;
		//gameScore += 1; gameScore = gamescore +1;
		// gameScore++ �� ��� lastScore 150
		// ++gameScore �� ��� lastScore 151
		
		System.out.println(lastScore);
		System.out.println(gameScore);
	}
}
