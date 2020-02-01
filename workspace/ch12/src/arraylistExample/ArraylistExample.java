package arraylistExample;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistExample {
	public static void main(String[] args) {
		String[] numArray = new String[2];
		numArray[0] = "one";
		numArray[1] = "two";
//		numArray[2] = "three";
		//공간의 길이를 정해줘야함 => 넘어가면 예외
		//남으면 공간낭비
		
		//ArrayList >>> 넣고 싶은 것을 넣을 수 있음 / 공간낭비가 없고 공간 길이 제약이 없음
		ArrayList<String> al = new ArrayList(); //al라는 객체는 String형태의 데이터를 저장
		//add() : 데이터를 저장시켜주는 메소드
		//저장될 때 Object타입으로 저장(모든 자료형의 아버지)
		
		//알파벳은 a - z정렬
		al.add("1");
		al.add("3");
		al.add("5");
		al.add("2");
		Collections.sort(al);
		
		//size : 데이터 개수
		for(int i = 0; i < al.size(); i ++) {
			//get(i) : 리스트의 인덱스번호의 데이터를 들고옴 == arr[i]
//			String value = (String) al.get(i); //큰 => 작 (강제형변환)
			//generics를 사용하면 자기가 알아서 String형태로 변환되서 들어감
			String value = al.get(i); //큰 => 작 (강제형변환)
			System.out.println(value);
		}
		System.out.println();
		//인덱스번호 혹은 데이터로 저장된 데이터 삭제
		al.remove(2); //인덱스번호 2의 데이터
		al.remove("5"); //"5"데이터
		for(int i = 0; i < al.size(); i ++) {
			//get(i) : 리스트의 인덱스번호의 데이터를 들고옴 == arr[i]
//			String value = (String) al.get(i); //큰 => 작 (강제형변환)
			//generics를 사용하면 자기가 알아서 String형태로 변환되서 들어감
			String value = al.get(i); //큰 => 작 (강제형변환)
			System.out.println(value);
		}
	}
}