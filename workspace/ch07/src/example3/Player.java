package example3;

public class Player {
	String name;
	int age;
	
	//����Ŭ������ ������
	Player(String name, int age){
		this.name = name;
		if(age > 0 && age <= 999)
			this.age = age;
	}

}
