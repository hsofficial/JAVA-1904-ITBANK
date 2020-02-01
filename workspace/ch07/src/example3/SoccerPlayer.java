package example3;

public class SoccerPlayer extends Player {
	int goalNum;
	/* 부모생성자를 호출하는 이유
	 * 
	 */

	SoccerPlayer(String name, int age, int goalNum) {
		super(name, age);
		this.goalNum = goalNum;
	}

}
