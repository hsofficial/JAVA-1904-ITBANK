package example3;

public class PlayerExample {
	public static void main(String[] args) {
		
		//SoccerPlayer : 클래스(자료형)
		//son : 객체(변수)
		//new : 동적할당 => 주소를 전달 => son
		
		SoccerPlayer son = new SoccerPlayer("손흥민", 28, 20);
		System.out.println("이름 : " + son.name);
		System.out.println("나이 : " + son.age);
		System.out.println("골수 : " + son.goalNum);
	}
}
