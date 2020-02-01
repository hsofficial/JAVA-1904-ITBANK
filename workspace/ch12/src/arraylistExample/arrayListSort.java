package arraylistExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Comparable�� ���� => �� ������ �޼ҵ� compareTo�� �̿��ؼ� ����
class Student implements Comparable{
	String name;
	int score;
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	@Override
	public int compareTo(Object o) {
		//Object�� �޾Ƹ��� o��ü�� (Student)�� �ٲٰ�  �� ���� score�� ��
		//�������� ����
		return this.score - ((Student)o).score;
	}
}

public class arrayListSort {
	public static void main(String[] args) {
		//�ڹ��� ��� ����� Ŭ������ �����������
		int[] s1 = {80, 70, 90, 78, 69};
		Arrays.sort(s1);
		for(int i : s1) { //for each => python�� for
			System.out.print(i + " ");
		}
		
		//�տ��� ����� ��ǻ�Ͱ� �˰��ִ� �ڷ��� => String, Integer, Double => �޼ҵ尡 �� �۵��մϴ�.
		//���� ���� StudentŬ������ �־��ָ� �۵��� ����ξ��� => ���� ���ݸ���Ŷ� �𸣴� �ڷ���
		ArrayList<Student> arraylist = new ArrayList<Student>();
		arraylist.add(new Student("������",99));
		arraylist.add(new Student("������",98));
		arraylist.add(new Student("������",97));
		arraylist.add(new Student("����ö",96));
		System.out.println();
		for(Student st : arraylist)
			System.out.print(st.score +" ");
		System.out.println();
		
		Collections.sort(arraylist);

	}
}
