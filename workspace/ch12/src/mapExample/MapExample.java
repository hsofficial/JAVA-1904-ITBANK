package mapExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		// key : value가 짝지어 저장되기 때문에 제네릭스도 두 개를 지정합니다.
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		
		//map은 key값이 중복이 안되요 => value는 같아도 됨
		//은행 : bank
		//돈집 : bank
		
		//은행 : bank
		//은행 : moneyhouse
		hashMap.put("송진우", 30);
		hashMap.put("송동열", 30);
		hashMap.put("송보민", 22);
		hashMap.put("송진우", 30); //key가 같으면 value가 덮어씌워진다.
		
		//map의 key만 모아서 set형태로 바꿔줘요
		Set<String> keySet =  hashMap.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = hashMap.get(key); //key를 가지고 value를 찾아서 들고옵니다.
			System.out.println(key + " : " + value);
		}
		System.out.println();
		hashMap.remove("송진우"); //key를 찾아서 지웁니다.
		System.out.println("총 인원 : " + hashMap.size());
	}
}