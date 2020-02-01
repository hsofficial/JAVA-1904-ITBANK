package class1;

//main이 없는 클래스 : 라이브러리(도구) 클래스
public class Character {
	//멤버변수(필드)
	String id;
	String pw;
	byte gender; //1, 0이면 충분해서 굳이 String 필요없음
	int nation; //국가번호 > 메모리 절약
	String job;
	
	//맴버함수(메서드)
	void attack() {System.out.println("Q평E평RQ평");}
	void item() {System.out.println("빨간포션 먹는다.");}
	void chat() {System.out.println("아니");}
}