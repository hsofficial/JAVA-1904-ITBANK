package question2;

public class ManExample {
	public static void main(String[] args) {
		Man song = new Man("������");
		Cat c01 = new Cat("ġ��");
		Dog d01 = new Dog("���");
		Friend f01 = new Friend("ȫ��ȣ");
		
		song.give(c01); //�����찡 ġ��� ������ ���.
		song.give(d01); //�����찡 ��̿��� ������ ���.
		song.give(f01); //�����찡 ȫ��ȣ���� ����� �������.
	}
}
