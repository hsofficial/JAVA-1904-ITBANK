package question2;

//superclass

public class Animal {
	public int age;
	public double weight;
	public String str1;
	boolean sleepSwitch = false;
	
	public Animal(int age, double weight) {
		this.age = age;
		this.weight = weight;
	}

	void sleep() {
		sleepSwitch = !sleepSwitch;
		if(sleepSwitch)
			System.out.println("��~");
		else
			System.out.println("����!");
	}

    void speak() {
		System.out.println("���Ѵ�");
	}

	void eat(String str1) {
		this.str1 = str1;
		System.out.println(this.str1 + "��(��) �Դ´�");
		
	}

	void show() {
		System.out.println(this.age + "�� " + this.weight + "Kg ");
		
	}
	
	
}
