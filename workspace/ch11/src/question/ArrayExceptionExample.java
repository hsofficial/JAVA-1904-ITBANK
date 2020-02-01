package question;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayExceptionExample {
	public static void main(String[] args) {
		/* 정수형 2칸짜리 배열 선언
		 * for반복문으로 그 배열에 데이터를 3개 넣어주세요
		 * 예외처리해주세요
		 */
		Scanner sc= new Scanner(System.in);
		int[] numArray = new int[2];
		try {
			for(int i = 0 ; i < 3 ; i++)
			{
				System.out.print(i + 1 + "번째 아무 숫자나 입력");
				numArray[i] = sc.nextInt();
				
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 넘어갔습니다.");
		} catch (InputMismatchException e) {
			System.out.println("숫자가 아닙니다.");
		} catch(Exception e) {
			System.out.println("알 수 없는 예외입니다.");
		}
	}
}
