package generics;

/* ArrayList에서 주로사용
 * ArrayList는 Object형태로 데이터를 저장
 * Object는 모든 데이터타입을 받을 수 있는 super class
 * String로 변환 시킬 때 String로 강제형 변환 시켜주어야 함
 * 변형시 번거로움 > generics 사용
 * generics : 클래스내부에서 사용할 데이터 타입을 외부에서 지정하는 방법
 */

class Person<T>{ //클래스내부에 T라고 적어놨어 => 객체생성할때 지정해놓은 자료형으로 변경될거야
	public T info;
	public T name;
	public int age;
}

public class GenericsExample {
	public static void main(String[] args) {
		//클래스 생성시 바로 자료형이 결정되는게 아니라 객체 생성시 정해준 자료형으로 생성
		Person<String> p1 = new Person<String>();
		p1.info = "진우";
	}
}
