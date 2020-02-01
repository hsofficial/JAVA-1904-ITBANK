package input;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/* C언어의 scanf()
		 * 파이썬의 input()
		 * 자바 5버전 이후에 나온 Scanner객체를 사용
		 * 5버전 전에는 bufferedreader => 코드가 길고 난해함
		 */
		
		//1.스캐너(입력) 객체 작성(ctrl + shift + o)
		//System.in : 표준 입력 스트림 : 키보드 입력을 받아주는 스트림
		//stream : 흐름 : 파일, http데이터, 키보드입력 : 처음과 끝이 있는 데이터들
		Scanner scan = new Scanner(System.in);

		//2. 스캐너 객체의 입력 메소드 사용
		System.out.print("문자열 입력 : ");
		String s1 = scan.nextLine();
		System.out.println("입력된 문자열 : " + s1);
		
		//3.입력 객체 해제(해제하지 않으면 버퍼에 다른 값이 남을 수 있음)
		scan.close();
		/*안쓰는 메모리 공간을 알아서 정리
		 * java, py >>> Garbage Collector
		 * System.gc(); => Garbage Collector 수동실행 명령어
		 */
	}
}
