package question2;

public class AnimalExample {
	public static void main(String[] args) {
		Animal animal = new Animal(30, 66.6);//����, ����
		Dog kkami = new Dog(3, 3.5, "poodle"); //����, ����, ��
		Cat cheese = new Cat(4, 2.5, "cheese"); //����, ����, ��
		
		animal.sleep(); //�ܴ�
		animal.speak(); //¢�´�
		animal.eat("���"); //��⸦ �Դ´�
		animal.show();//3�� 3.5kg
		System.out.println("-----");
		
		kkami.sleep(); //�ܴ�
		kkami.speak(); //�۸�
		kkami.eat("�����"); //����Ḧ �Դ´�
		kkami.show(); //3�� 3.5kg ���� : poodle
		System.out.println("-----");
		
		cheese.sleep(); //�ܴ�
		cheese.speak(); //�ɳ�
		cheese.eat("��"); //�򸣸� �Դ´�
		cheese.show(); //4�� 2.5kg ���� : cheese
		System.out.println("-----");
	}
}
