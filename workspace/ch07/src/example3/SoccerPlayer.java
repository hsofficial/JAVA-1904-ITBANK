package example3;

public class SoccerPlayer extends Player {
	int goalNum;
	/* �θ�����ڸ� ȣ���ϴ� ����
	 * 
	 */

	SoccerPlayer(String name, int age, int goalNum) {
		super(name, age);
		this.goalNum = goalNum;
	}

}
