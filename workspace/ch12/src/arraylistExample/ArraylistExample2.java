package arraylistExample;

import java.util.ArrayList;

public class ArraylistExample2 {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>(); //���ڿ� ArrayList
		ArrayList<Integer> age = new ArrayList<Integer>(); //������ ArrayList
		
		//���׸�Ÿ���� ������ ArrayList�� �ٸ� ������Ÿ���� ���� �� ����.
		name.add("�糪");
		name.add("����");
		name.add("ä��");
		name.add("�̳�");
//		name.add(123);	//���׸��� Ÿ������ > �ٸ� Ÿ�� �ȵ�
		
		age.add(23);
		age.add(21);
		age.add(22);
		age.add(24);
//		age.add("�����λ�");
		
		System.out.println("Ʈ���̽�\n");
		for(int i = 0; i < name.size(); i ++)
			System.out.printf("[%s] : %d\n",name.get(i),age.get(i));
	}
}
