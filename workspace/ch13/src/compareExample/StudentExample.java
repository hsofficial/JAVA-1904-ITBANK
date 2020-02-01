package compareExample;

import java.util.Objects;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student(9);
		Student s2 = new Student(20);
		Student s3 = new Student(18);
		
		int result;
		//Objects.compare(��ü1, ��ü2, ��Ŭ����)
		result = Objects.compare(s1, s2, new StudentComparator());
		if(result == 0)
			System.out.println("����");
		else if(result == -1)
			System.out.println("s1�� �� �۽��ϴ�.");
		else if(result == 1)
			System.out.println("s2�� �� �۽��ϴ�.");
	}
}
