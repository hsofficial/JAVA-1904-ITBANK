package operator;

public class K_CompareExample {
	public static void main(String[] args) {
		//String�� intó�� �⺻�ڷ����� �ƴ�
		//String�� Ŭ���� => Ŭ������ ��ü�� ����� ���
		int num;
		String str1 = "KG ITBANK";//String class�� ��ü str1
		String str2 = "KG ITBANK";
		String str3 = new String("KG ITBANK"); //new : malloc : �����Ҵ�
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		//���� Ÿ��(��üó�� �ּҸ� ������ �ִ� �� Ÿ��)�� ���Ҷ� ���� �� ���Ϸ��� equal �޼��� ���
		System.out.println(str1.equals(str3));
	}
}
