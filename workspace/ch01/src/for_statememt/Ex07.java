package for_statememt;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		/* 1 ~ 10까지의 난수 중 총 5회, 회당 10번씩 숫자를 뽑았을때
		 * 입력받은 숫자가 몇 번 나오는지 출력해주세요
		 * 
		 * 숫자입력 : 7
		 * 1회 : 0번
		 * 2회 : 1번
		 * 3회 : 0번
		 * 4회 : 3번
		 * 5회 : 2번
		 * 
		 * 7이 총 6번 나왔습니다.
		 * 이중 for문 활용
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("1에서 10사이의 실수 입력 : ");
		int num = sc.nextInt();
		int total = 0;
		
		for(int i = 1; i <= 5; i++) {
			int cnt = 0;	//회당 몆번
			for(int j = 1; j <= 10; j++) {
				int rand = (int)(Math.random() * (11 - 1) + 1);
					if(num == rand) {
						cnt ++;
					}
			}
			System.out.println(i + "회 : " + cnt);
			total += cnt;
		}
		System.out.println(num + "이 총" + total +"번 나옴");
	}
}
