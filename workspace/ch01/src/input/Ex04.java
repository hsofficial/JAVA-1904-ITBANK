package input;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		/*
		 * 국영수 입력 >>> 합계(정수) 평균(실수)출력
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 입력 : ");
		int mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		
		double avg = (double)sum/3.0;
				
		System.out.println(sum);
		System.out.println(avg);
		
		//#은 생략가능 0은 무조건 표현
		//3.140 => "#,###" => 3.14
		//3.140 => "0,000" => 3.140
		
		DecimalFormat df = new DecimalFormat("#,##");	//소수점을 최대 두자리까지 출력
//		DecimalFormat df = new DecimalFormat("#.00"); //소수점을 무조건 두자리까지 출력
//		DecimalFormat df = new DecimalFormat("#.###"); //천단위 구분기호 출력
		String a = df.format(avg);
		System.out.println("평균 : " + a);
		
		sc.close();
	}
}
