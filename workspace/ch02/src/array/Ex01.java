package array;

public class Ex01 {
	public static void main(String[] args) {
		/* 배열(Array)
		 * 데이터를 복수개 저장할 수 있는 데이터 타입
		 * 배열의 길이는 변경될 수 없다.
		 */
		int len = 5;
		int[] score = new int[len]; //5칸짜리 정수배열 선언
//		int score2[] = new int[len]; 이렇게 선언하지 말라고 합니다.
		//도메인 같은 느낌 => 즐겨찾기
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;
		score[3] = 40;
		score[4] = 50;
		int tmp = score[0] + score[4];
		System.out.println(tmp);
		for(int i = 0; i < len; i ++) {
			System.out.println("score[" + i + "] : " + score[i]);
		}
	}
}
