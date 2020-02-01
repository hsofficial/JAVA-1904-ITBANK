package mapExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		// key : value�� ¦���� ����Ǳ� ������ ���׸����� �� ���� �����մϴ�.
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		
		//map�� key���� �ߺ��� �ȵǿ� => value�� ���Ƶ� ��
		//���� : bank
		//���� : bank
		
		//���� : bank
		//���� : moneyhouse
		hashMap.put("������", 30);
		hashMap.put("�۵���", 30);
		hashMap.put("�ۺ���", 22);
		hashMap.put("������", 30); //key�� ������ value�� ���������.
		
		//map�� key�� ��Ƽ� set���·� �ٲ����
		Set<String> keySet =  hashMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = hashMap.get(key); //key�� ������ value�� ã�Ƽ� ���ɴϴ�.
			System.out.println(key + " : " + value);
		}
		System.out.println();
		hashMap.remove("������"); //key�� ã�Ƽ� ����ϴ�.
		System.out.println("�� �ο� : " + hashMap.size());
	}
}