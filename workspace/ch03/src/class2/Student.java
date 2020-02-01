package class2;

//라이브러리(도구) 클래스
public class Student {
	//필드
	String name;
	int age;
	
	//생성자 : 객체 생성 시에 단 한번만 호출되는 메소드(함수)
	//반환형이 없고 클래스와 이름이 같은 메소드
	//python : __init__()
	
	public Student(String nm, int a) {
		name = nm;
		age = a;
	}
}