package example6;

public class ExerciseStudent extends Student{//�ڳ� ��ü
	int weight;
	ExerciseStudent(String name, int age, int grade, int weight) {
		super(name, age, grade);//�θ� ������ ȣ�� > ���θ� ������ ȣ��
		this.weight = weight;
	}
	@Override
	public void show() {
		super.show(); //���θ��� show ȣ��
		System.out.println("3�� : " + weight);
	}
}
