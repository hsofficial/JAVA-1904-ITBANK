package question2;

//����Ŭ����
public class Cat extends Animal{
	String species;//����
	Cat(int age, double weight, String species) {
		super(age, weight);
		this.species = species;
	}
	
	@Override
	void speak() {
		System.out.println("�ɳ�");
	}
	@Override
	void show() {
		System.out.printf("���� : %d, ���� : %.2f, ���� : %s\n",age, weight,species);
	}
}
