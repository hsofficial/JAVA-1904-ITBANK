package compareExample;

import java.util.Comparator;

/* 
 * public interface Comparator<T>{
 * 	int compare(T a, T b);
 * }
 */
public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.num < s2.num) //������ ��ü�� ũ�� -1
			return -1;
		else if(s1.num > s2.num) //���� ��ü�� ũ�� 1
			return 1;
		else //�� �� ������ 0
			return 0;
	}
	
}
