package question;

public class personB extends People {

	public personB(String name, String hobby, String school, int age) {
		super(name, hobby, school, age);
	}
	
	@Override
	void talk() {
		System.out.println("�̸��� "+name+" ��̴� "+hobby+" �б��� "+school+" ���̴� "+age+" �Դϴ�. ");
		
	}
	


}
