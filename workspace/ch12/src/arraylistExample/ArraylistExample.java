package arraylistExample;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistExample {
	public static void main(String[] args) {
		String[] numArray = new String[2];
		numArray[0] = "one";
		numArray[1] = "two";
//		numArray[2] = "three";
		//������ ���̸� ��������� => �Ѿ�� ����
		//������ ��������
		
		//ArrayList >>> �ְ� ���� ���� ���� �� ���� / �������� ���� ���� ���� ������ ����
		ArrayList<String> al = new ArrayList(); //al��� ��ü�� String������ �����͸� ����
		//add() : �����͸� ��������ִ� �޼ҵ�
		//����� �� ObjectŸ������ ����(��� �ڷ����� �ƹ���)
		
		//���ĺ��� a - z����
		al.add("1");
		al.add("3");
		al.add("5");
		al.add("2");
		Collections.sort(al);
		
		//size : ������ ����
		for(int i = 0; i < al.size(); i ++) {
			//get(i) : ����Ʈ�� �ε�����ȣ�� �����͸� ���� == arr[i]
//			String value = (String) al.get(i); //ū => �� (��������ȯ)
			//generics�� ����ϸ� �ڱⰡ �˾Ƽ� String���·� ��ȯ�Ǽ� ��
			String value = al.get(i); //ū => �� (��������ȯ)
			System.out.println(value);
		}
		System.out.println();
		//�ε�����ȣ Ȥ�� �����ͷ� ����� ������ ����
		al.remove(2); //�ε�����ȣ 2�� ������
		al.remove("5"); //"5"������
		for(int i = 0; i < al.size(); i ++) {
			//get(i) : ����Ʈ�� �ε�����ȣ�� �����͸� ���� == arr[i]
//			String value = (String) al.get(i); //ū => �� (��������ȯ)
			//generics�� ����ϸ� �ڱⰡ �˾Ƽ� String���·� ��ȯ�Ǽ� ��
			String value = al.get(i); //ū => �� (��������ȯ)
			System.out.println(value);
		}
	}
}