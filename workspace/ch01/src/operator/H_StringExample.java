package operator;

public class H_StringExample {
public static void main(String[] args) {
	/*
	 * ������ : +
	 * +�� ���, ��ȣ�������� ���ÿ� ���ڿ� ���Ῥ����
	 * �ǿ����ڰ� ���ڿ��� ��� +�����ڰ� ���ڿ��� ������
	 * char[]�迭ó�� ���� ��ĭ���� �̸� �Ҵ��� ���ص� �ȴ�
	 * 
	 */
	
	
	String str01 = "0"+"�й�";
	System.out.println(str01);
	
	String str1 = 0 + (9 + "�й�");
	System.out.println(str1);
	
	String str2 = str1 + ' ' + "ȫ�浿";
	System.out.println(str2);
	
	String str3 = 3 + 0.14 + "(��)";
	System.out.println(str3);
	
	
	}

}
