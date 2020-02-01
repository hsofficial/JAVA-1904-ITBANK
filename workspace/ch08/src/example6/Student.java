package example6;

public class Student extends Person{ //부모객체
	protected int grade;
	Student(String name, int age, int grade) {
		super(name, age); //조부모 객체
		this.grade = grade;
	}
	
	@Override
	public void show() {
		super.show(); //조부모의 show 들고와서 출력
		System.out.println("학년 : " + grade);
	}
}
