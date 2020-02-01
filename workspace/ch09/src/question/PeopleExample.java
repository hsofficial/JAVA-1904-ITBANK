package question;

public class PeopleExample {
	public static void main(String[] args) {
		/* People 데이터형태의 배열 group을 사람 수 만큼 만들고
		 * 각자의 이름취미, 학교, 나이를 입력
		 * 반복문을 이용하여 talk메소드 출력
		 * 추상클래스문제
		 */
		People[] group = new People[2];
		group[0] = new personA("A","movie","Daedong", 30);
		group[1] = new personB("B","game","Busan", 30);
		System.out.println("자기소개\n");
		for(int i = 0; i < group.length; i ++) {
			group[i].talk();
			System.out.println();
		}
		/* 
		 * 자기소개
		 * 안녕하세요
		 * 내 이름은 A입니다 나이는 30살, Daedong 학교에 다니고 있고, 취미는 movie입니다
		 * 
		 */
	}
}
