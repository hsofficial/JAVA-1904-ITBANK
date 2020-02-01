package question;

public abstract class People {
	/* 필드 : 이름, 나이, 취미, 학교
	 * 필드에 값을 입력받는 생성자 선언
	 * 자신의 필드의 값을 알려주는 talk 추상메소드 선언
	 */
	String name;
	String hobby;
	String school;
	int age;
	
	public People(String name, String hobby, String school, int age) {
		this.name = name;
		this.hobby = hobby;
		this.school = school;
		this.age = age;
	}		
	abstract void talk();
}
