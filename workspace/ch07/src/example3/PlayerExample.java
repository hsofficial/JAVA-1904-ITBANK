package example3;

public class PlayerExample {
	public static void main(String[] args) {
		
		//SoccerPlayer : Ŭ����(�ڷ���)
		//son : ��ü(����)
		//new : �����Ҵ� => �ּҸ� ���� => son
		
		SoccerPlayer son = new SoccerPlayer("�����", 28, 20);
		System.out.println("�̸� : " + son.name);
		System.out.println("���� : " + son.age);
		System.out.println("��� : " + son.goalNum);
	}
}
