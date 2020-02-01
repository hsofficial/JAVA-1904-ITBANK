package generics;

/* ArrayList���� �ַλ��
 * ArrayList�� Object���·� �����͸� ����
 * Object�� ��� ������Ÿ���� ���� �� �ִ� super class
 * String�� ��ȯ ��ų �� String�� ������ ��ȯ �����־�� ��
 * ������ ���ŷο� > generics ���
 * generics : Ŭ�������ο��� ����� ������ Ÿ���� �ܺο��� �����ϴ� ���
 */

class Person<T>{ //Ŭ�������ο� T��� ������� => ��ü�����Ҷ� �����س��� �ڷ������� ����ɰž�
	public T info;
	public T name;
	public int age;
}

public class GenericsExample {
	public static void main(String[] args) {
		//Ŭ���� ������ �ٷ� �ڷ����� �����Ǵ°� �ƴ϶� ��ü ������ ������ �ڷ������� ����
		Person<String> p1 = new Person<String>();
		p1.info = "����";
	}
}
