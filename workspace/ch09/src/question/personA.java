package question;

public class personA extends People {

	public personA(String name, String hobby, String school, int age) {
		super(name, hobby, school, age);
	}
	
	@Override
	void talk() {
		System.out.println("이름은 "+name+" 취미는 "+hobby+" 학교는 "+school+" 나이는 "+age+" 입니다. ");
		
	}
	


}
