package arraylistExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Comparable를 구현 => 그 내부의 메소드 compareTo를 이용해서 정렬
class Student implements Comparable{
	String name;
	int score;
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	@Override
	public int compareTo(Object o) {
		//Object로 받아먹은 o객체를 (Student)로 바꾸고  그 안의 score로 비교
		//오름차순 정렬
		return this.score - ((Student)o).score;
	}
}

public class arrayListSort {
	public static void main(String[] args) {
		//자바의 모든 기능은 클래스로 만들어져있음
		int[] s1 = {80, 70, 90, 78, 69};
		Arrays.sort(s1);
		for(int i : s1) { //for each => python의 for
			System.out.print(i + " ");
		}
		
		//앞에서 배웠던 컴퓨터가 알고있는 자료형 => String, Integer, Double => 메소드가 잘 작동합니다.
		//내가 만든 Student클래스로 넣어주면 작동을 제대로안해 => 내가 지금만든거라서 모르는 자료형
		ArrayList<Student> arraylist = new ArrayList<Student>();
		arraylist.add(new Student("이지금",99));
		arraylist.add(new Student("이지은",98));
		arraylist.add(new Student("이지동",97));
		arraylist.add(new Student("이지철",96));
		System.out.println();
		for(Student st : arraylist)
			System.out.print(st.score +" ");
		System.out.println();
		
		Collections.sort(arraylist);

	}
}
