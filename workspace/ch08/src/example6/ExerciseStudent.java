package example6;

public class ExerciseStudent extends Student{//자녀 객체
	int weight;
	ExerciseStudent(String name, int age, int grade, int weight) {
		super(name, age, grade);//부모 생성자 호출 > 조부모 생성자 호출
		this.weight = weight;
	}
	@Override
	public void show() {
		super.show(); //조부모의 show 호출
		System.out.println("3대 : " + weight);
	}
}
