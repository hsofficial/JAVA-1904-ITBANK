package swich_statement;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		/* 주민번호 뒷 자리를 입력 받고,
		 * 남성인지 여성인지를 출력(switch문, 산술연산자 사용)
		 * 
		 * 예시>
		 * 1021456, 3021456
		 * 뒷 자리가 1또는 3이면 남자
		 * 
		 * 2021456, 4021456
		 * 뒷 자리가 2또는 4이면 여자
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호 뒷자리 입력(1234567) : ");
		int num = Integer.parseInt(sc.nextLine()) / 1000000;
		
		switch (num) {
		case 1: case 3:
			System.out.println("남자입니다.");
			break;
		case 2: case 4:
			System.out.println("여자입니다.");
			break;
		default:
			System.out.println("알수 없음");
			break;
		}
		
	}
}
