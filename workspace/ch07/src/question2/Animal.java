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
			System.out.println("ÄÚ~");
		else
			System.out.println("¹ú¶±!");
	}

    void speak() {
		System.out.println("¸»ÇÑ´Ù");
	}

	void eat(String str1) {
		this.str1 = str1;
		System.out.println(this.str1 + "À»(¸¦) ¸Ô´Â´Ù");
		
	}

	void show() {
		System.out.println(this.age + "»ì " + this.weight + "Kg ");
		
	}
	
	
}
