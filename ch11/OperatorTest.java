package ch11;

public class OperatorTest {
	public static void main(String[] args) {

		int gameScore = 150;
		
		int lastScore = gameScore++;
		//gameScore += 1; gameScore = gamescore +1;
		// gameScore++ 일 경우 lastScore 150
		// ++gameScore 일 경우 lastScore 151
		
		System.out.println(lastScore);
		System.out.println(gameScore);
	}
}
