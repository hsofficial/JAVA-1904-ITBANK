package example6;

public class Student extends Person{ //�θ�ü
	protected int grade;
	Student(String name, int age, int grade) {
		super(name, age); //���θ� ��ü
		this.grade = grade;
	}
	
	@Override
	public void show() {
		super.show(); //���θ��� show ���ͼ� ���
		System.out.println("�г� : " + grade);
	}
}
