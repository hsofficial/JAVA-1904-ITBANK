package setExample;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
	public static void main(String[] args) {
		//Set�� ������ �����(�ε���x), ������ �ߺ������� �ȵǿ�
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(2); //�ߺ�����
		hashSet.add(4);
		hashSet.add(5);
		hashSet.add(5); //�ߺ�����
		
		System.out.println("HashSet : ");
		
		//Set �ڷ����� �ε����� ���� ������(������ ����)  Iterator��ü�� �����ߵȴ�.(�ݺ���)
		Iterator<Integer> i = hashSet.iterator();
		while(i.hasNext()) { //���� ������ ������ T ������ F
			System.out.print(i.next() + " ");
		}
	}
}