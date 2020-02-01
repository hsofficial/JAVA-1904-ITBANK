package example6;

import java.util.Scanner;

public class PersonExample {
	public static void main(String[] args) {
		Person[] arr = new Person[30]; //상위클래스의 배열을 만듭니다.
		String name;
		int age, grade, weight, select, cnt = 0;
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("[[ 학생 등록 프로그램 ]]");
			System.out.println("1.일반인");
			System.out.println("2.학생");
			System.out.println("3.체대준비생");
			System.out.println("4.목록");
			System.out.print(">> ");
			select = Integer.parseInt(sc.nextLine());
			
			if(select == 1) {
				System.out.print("이름 : "); name = sc.nextLine();
				System.out.print("나이 : "); age = sc.nextInt();
				sc.nextLine();
				arr[cnt++] = new Person(name, age);
			}
			else if(select == 2) {
				System.out.print("이름 : "); name = sc.nextLine();
				System.out.print("나이 : "); age = sc.nextInt();
				System.out.print("학년 : "); grade = sc.nextInt();
				sc.nextLine();
				arr[cnt++] = new Student(name, age, grade);
			}
			else if(select == 3) {
				System.out.print("이름 : "); name = sc.nextLine();
				System.out.print("나이 : "); age = sc.nextInt();
				System.out.print("학년 : "); grade = sc.nextInt();
				System.out.print("3대 : "); weight = sc.nextInt();
				sc.nextLine();
				arr[cnt++] = new ExerciseStudent(name, age, grade, weight);
			}
			else if(select == 4) {
				//상위클래스의 배열에 모든 하위객체를 저장후 출력
				for(int i = 0; i < cnt; i++) {
					System.out.println("===============================");
					arr[i].show();
				}
			}
		}
	}
}
