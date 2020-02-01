package while_statement;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		/* UPDOWN게임
		 * 컴퓨터가 낸 1 ~ 100사이의 난수를 사용자가 맞추면 탈출 => 몇회만에 맞췄는지 출력
		 * 
		 * computer : 77
		 * 
		 * [ 게임 시작 ]
		 * 숫자 입력 : 50
		 * UP
		 * 
		 * [ 게임 시작 ]
		 * 숫자 입력 : 80
		 * DOWN
		 * 
		 * [ 게임 시작 ]
		 * 숫자 입력 : 77
		 * 3회만에 맞췄습니다.
		 */
		Scanner sc = new Scanner(System.in);
		int computer = (int)(Math.random() * 100 + 1); // 0 ~ 99 => 1 ~ 100
		int count = 0;
		while(true) { //무한반복문
			System.out.print("숫자 입력 : ");
			int user = sc.nextInt();
			count ++;
			if(computer > user)
				System.out.println("UP");
			else if(computer < user)
				System.out.println("DOWN");
			else {
				System.out.println("총 " + count + "회 만에 맞췄습니다.");
				break;
			}
		}
		sc.close();
	}
}