package for_statememt;

public class Ex02 {
	public static void main(String[] args) {
//		for(int i =0 ; ; i++) {//무한반복문 >>> 조건식없으므로 거짓이 될 수 없음
//			System.out.println(i);
//		}
		for(int i = 0, j = 10; i <= 5 && j >= 5; i ++, j --) {
			System.out.println("i : " + i + ", j : " + j);
		}
	}
}
