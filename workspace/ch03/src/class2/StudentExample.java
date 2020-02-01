package class2;

//실행용 클래스
public class StudentExample {
	public static void main(String[] args) {
		//Student클래스로 s1객체 생성
		//s1은 Student클래스의 인스턴스
		//생성자는 객체생성될때 실행되는 메소드(묵시적 호출)	
		//func(); 명시적 호출 : 이름을 불러서 실행
		Student s1 = new Student("dlwlrma" , 27);
		System.out.println(s1.name);
		System.out.println(s1.age);
		
		Student s2 = new Student("이지은" , 26);
		System.out.println(s2.name);
		System.out.println(s2.age);
	}
}