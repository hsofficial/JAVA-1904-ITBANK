package question2;

public class Dog extends Animal{
	
	public String kind;
	
	public Dog(int age, double weight, String kind) {
		super(age, weight);
		this.kind = kind;
	}

	@Override
	void speak() {
		System.out.println("�۸�");
	}
	
	@Override
	void show() {
		System.out.println(this.age + "�� " + this.weight + "Kg " + this.kind + "��");
	}

}
