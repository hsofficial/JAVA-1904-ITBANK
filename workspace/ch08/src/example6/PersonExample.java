package example6;

import java.util.Scanner;

public class PersonExample {
	public static void main(String[] args) {
		Person[] arr = new Person[30]; //����Ŭ������ �迭�� ����ϴ�.
		String name;
		int age, grade, weight, select, cnt = 0;
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("[[ �л� ��� ���α׷� ]]");
			System.out.println("1.�Ϲ���");
			System.out.println("2.�л�");
			System.out.println("3.ü���غ��");
			System.out.println("4.���");
			System.out.print(">> ");
			select = Integer.parseInt(sc.nextLine());
			
			if(select == 1) {
				System.out.print("�̸� : "); name = sc.nextLine();
				System.out.print("���� : "); age = sc.nextInt();
				sc.nextLine();
				arr[cnt++] = new Person(name, age);
			}
			else if(select == 2) {
				System.out.print("�̸� : "); name = sc.nextLine();
				System.out.print("���� : "); age = sc.nextInt();
				System.out.print("�г� : "); grade = sc.nextInt();
				sc.nextLine();
				arr[cnt++] = new Student(name, age, grade);
			}
			else if(select == 3) {
				System.out.print("�̸� : "); name = sc.nextLine();
				System.out.print("���� : "); age = sc.nextInt();
				System.out.print("�г� : "); grade = sc.nextInt();
				System.out.print("3�� : "); weight = sc.nextInt();
				sc.nextLine();
				arr[cnt++] = new ExerciseStudent(name, age, grade, weight);
			}
			else if(select == 4) {
				//����Ŭ������ �迭�� ��� ������ü�� ������ ���
				for(int i = 0; i < cnt; i++) {
					System.out.println("===============================");
					arr[i].show();
				}
			}
		}
	}
}
