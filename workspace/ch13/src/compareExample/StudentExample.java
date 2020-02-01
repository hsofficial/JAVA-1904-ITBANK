package compareExample;

import java.util.Objects;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student(9);
		Student s2 = new Student(20);
		Student s3 = new Student(18);
		
		int result;
		//Objects.compare(객체1, 객체2, 비교클래스)
		result = Objects.compare(s1, s2, new StudentComparator());
		if(result == 0)
			System.out.println("같다");
		else if(result == -1)
			System.out.println("s1이 더 작습니다.");
		else if(result == 1)
			System.out.println("s2가 더 작습니다.");
	}
}
