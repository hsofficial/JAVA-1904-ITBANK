package example3;

public class Player {
	String name;
	int age;
	
	//수퍼클래스의 생성자
	Player(String name, int age){
		this.name = name;
		if(age > 0 && age <= 999)
			this.age = age;
	}

}
