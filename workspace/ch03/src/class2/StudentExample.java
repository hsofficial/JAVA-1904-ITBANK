package class2;

//����� Ŭ����
public class StudentExample {
	public static void main(String[] args) {
		//StudentŬ������ s1��ü ����
		//s1�� StudentŬ������ �ν��Ͻ�
		//�����ڴ� ��ü�����ɶ� ����Ǵ� �޼ҵ�(������ ȣ��)	
		//func(); ����� ȣ�� : �̸��� �ҷ��� ����
		Student s1 = new Student("dlwlrma" , 27);
		System.out.println(s1.name);
		System.out.println(s1.age);
		
		Student s2 = new Student("������" , 26);
		System.out.println(s2.name);
		System.out.println(s2.age);
	}
}