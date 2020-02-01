package question2;

public class AnimalExample {
	public static void main(String[] args) {
		Animal animal = new Animal(30, 66.6);//나이, 무게
		Dog kkami = new Dog(3, 3.5, "poodle"); //나이, 무게, 종
		Cat cheese = new Cat(4, 2.5, "cheese"); //나이, 무게, 종
		
		animal.sleep(); //잔다
		animal.speak(); //짖는다
		animal.eat("고기"); //고기를 먹는다
		animal.show();//3살 3.5kg
		System.out.println("-----");
		
		kkami.sleep(); //잔다
		kkami.speak(); //멍멍
		kkami.eat("개사료"); //개사료를 먹는다
		kkami.show(); //3살 3.5kg 견종 : poodle
		System.out.println("-----");
		
		cheese.sleep(); //잔다
		cheese.speak(); //냥냥
		cheese.eat("츄르"); //츄르를 먹는다
		cheese.show(); //4살 2.5kg 묘종 : cheese
		System.out.println("-----");
	}
}
