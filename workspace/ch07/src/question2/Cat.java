package question2;

//서브클래스
public class Cat extends Animal{
	String species;//묘종
	Cat(int age, double weight, String species) {
		super(age, weight);
		this.species = species;
	}
	
	@Override
	void speak() {
		System.out.println("냥냥");
	}
	@Override
	void show() {
		System.out.printf("나이 : %d, 무게 : %.2f, 묘종 : %s\n",age, weight,species);
	}
}
