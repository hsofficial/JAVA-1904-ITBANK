package array;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0; //�л���
		//null : ����Ÿ���� �ʱⰪ(�ƹ��͵� ������ �ּҰ� ����)
		int[] scores = null; //������ �����ϴ� �迭
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.�л� �� |2.���� �Է� |3.���� Ȯ�� |4.�м� |5.����");
			System.out.println("-----------------------------");
			System.out.print(">> ");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.println("�л� �� : ");
				studentNum = sc.nextInt();
				scores = new int[studentNum]; //heap�� �����Ҵ�� �迭�� �����ּҸ� ����
			}
			else if(select == 2) {
				if(studentNum != 0) { //�迭�� �����Ǿ�����
					for(int i = 0; i < scores.length; i++) {
						System.out.print((i + 1) + "��° �л����� : ");
						scores[i] = sc.nextInt(); //����� �迭�� i�� ��ҿ��� ������ �Է�
					}
				}
				else //�迭�� �������� �ʾ�����
					System.out.println("�л� ���� �Է��ϼ���!");
			}
			else if(select == 3) {
				//1�� �޴��� 2�� �޴��� ����� �ȴ����� �Ծ�
				if(studentNum != 0 && scores[0] != 0) {
					for(int i = 0; i < scores.length; i ++)
						System.out.println((i + 1) + "��° �л� ���� : " + scores[i]);
				}
				else 
					System.out.println("�л� ���� ������ �Է��ϼ���!");
			}
			else if(select == 4) {
				if(studentNum != 0 && scores[0] != 0) {
					int max = scores[0], min = scores[0], sum = scores[0];
					for(int i = 1; i < scores.length; i ++) {
						if(max < scores[i])
							max = scores[i];
						if(min > scores[i])
							min = scores[i];
						sum += scores[i];
					}
					double avg = sum / (double)scores.length;
					System.out.println("�ְ� ���� : " + max);
					System.out.println("���� ���� : " + min);
					System.out.println("��� ���� : " + avg);
				}
				else
					System.out.println("�л� ���� ������ �Է��ϼ���");
			}
			else if(select == 5) {
				System.out.println("�л� ���� ���α׷��� �����մϴ�.");
				run = false;
			}
		}
		sc.close();
	}
}













