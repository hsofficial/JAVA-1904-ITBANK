package array;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0; //학생수
		//null : 참조타입의 초기값(아무것도 저장한 주소가 없다)
		int[] scores = null; //점수를 저장하는 배열
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.학생 수 |2.점수 입력 |3.점수 확인 |4.분석 |5.종료");
			System.out.println("-----------------------------");
			System.out.print(">> ");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.println("학생 수 : ");
				studentNum = sc.nextInt();
				scores = new int[studentNum]; //heap에 동적할당된 배열의 참조주소를 저장
			}
			else if(select == 2) {
				if(studentNum != 0) { //배열이 생성되었을때
					for(int i = 0; i < scores.length; i++) {
						System.out.print((i + 1) + "번째 학생점수 : ");
						scores[i] = sc.nextInt(); //저장된 배열의 i번 요소에게 정수를 입력
					}
				}
				else //배열이 생성되지 않았을때
					System.out.println("학생 수를 입력하세요!");
			}
			else if(select == 3) {
				//1번 메뉴나 2번 메뉴를 제대로 안누르고 왔어
				if(studentNum != 0 && scores[0] != 0) {
					for(int i = 0; i < scores.length; i ++)
						System.out.println((i + 1) + "번째 학생 점수 : " + scores[i]);
				}
				else 
					System.out.println("학생 수나 점수를 입력하세요!");
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
					System.out.println("최고 점수 : " + max);
					System.out.println("최저 점수 : " + min);
					System.out.println("평균 점수 : " + avg);
				}
				else
					System.out.println("학생 수나 점수를 입력하세요");
			}
			else if(select == 5) {
				System.out.println("학생 관리 프로그램을 종료합니다.");
				run = false;
			}
		}
		sc.close();
	}
}













