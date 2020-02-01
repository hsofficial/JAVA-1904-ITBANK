package question;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UpdownGame {
	public static void main(String[] args) {
		/* 1 ~ 100사이의 랜덤한 숫자를 맞추는 게임을 만들어주세요
		 * 숫자가 아니라 영문자를 넣어보세요 어떤 예외가 뜨는지 => 예외처리해주세요
		 */
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0; //사용자 입력 저장공간
		int count = 0; //시도 횟수를 세기위한 변수
		while(true) {
				System.out.print("1과 100사이의 값을 입력 : ");
				Scanner sc = new Scanner(System.in);
			try {
				input = sc.nextInt(); //InputMismatchException을 예외처리
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력 가능합니다");
				continue;
			}
			
			if(answer > input)
				System.out.println("더 큰 수를 입력");
			else if(answer < input)
				System.out.println("더 작은 수를 입력");
			else {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 " + count + "번 입니다.");
				break;//while문을 벗어남
			}
		}
	}
}