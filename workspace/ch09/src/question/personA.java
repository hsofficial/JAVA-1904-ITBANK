package question;

public class personA extends People {

	public personA(String name, String hobby, String school, int age) {
		super(name, hobby, school, age);
	}
	
	@Override
	void talk() {
		System.out.println("�̸��� "+name+" ��̴� "+hobby+" �б��� "+school+" ���̴� "+age+" �Դϴ�. ");
		
	}
	


}
