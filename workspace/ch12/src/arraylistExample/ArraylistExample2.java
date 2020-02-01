package arraylistExample;

import java.util.ArrayList;

public class ArraylistExample2 {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>(); //문자열 ArrayList
		ArrayList<Integer> age = new ArrayList<Integer>(); //정수형 ArrayList
		
		//제네릭타입이 결정된 ArrayList는 다른 데이터타입을 넣을 수 없다.
		name.add("사나");
		name.add("다현");
		name.add("채영");
		name.add("미나");
//		name.add(123);	//제네릭스 타입지정 > 다른 타입 안들어감
		
		age.add(23);
		age.add(21);
		age.add(22);
		age.add(24);
//		age.add("스물두살");
		
		System.out.println("트와이스\n");
		for(int i = 0; i < name.size(); i ++)
			System.out.printf("[%s] : %d\n",name.get(i),age.get(i));
	}
}
