package example6;

public class Person { //조부모
	//protected - 같은 패키지 혹은 상속받은 클래스만 사용가능 >>> 다른 패키지에서도 상속받으면 사용 가능
	//default - 같은 패키지
	protected String name;
	protected int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
