package setExample;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
	public static void main(String[] args) {
		//Set은 순서가 없어요(인덱스x), 데이터 중복저장이 안되요
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(2); //중복저장
		hashSet.add(4);
		hashSet.add(5);
		hashSet.add(5); //중복저장
		
		System.out.println("HashSet : ");
		
		//Set 자료형은 인덱스가 없기 때문에(순서가 없다)  Iterator객체를 만들어야된다.(반복자)
		Iterator<Integer> i = hashSet.iterator();
		while(i.hasNext()) { //다음 데이터 있으면 T 없으면 F
			System.out.print(i.next() + " ");
		}
	}
}