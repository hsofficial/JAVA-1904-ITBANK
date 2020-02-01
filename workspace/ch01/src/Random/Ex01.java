package Random;

public class Ex01 {
	public static void main(String[] args) {
		//C언어는 0 ~ 32767사이의 숫자가 랜덤으로 반환 
		//rand() % 100 => 0 ~ 99
		//0.0 <= Math.random() < 1.0 사이의 숫자가 랜덤으로 나옴(실수)
		//0.000000000 <= r < 0.999999999
		double r = Math.random();	//math 수학 관련 메서드 들어있는 클래스
		System.out.println(r);
		System.out.println((int)(Math.random() * 10));	//0~9
		System.out.println((int)(Math.random() * 10) + 1);	//1~10
		
		//0 ~ 50 + 50 => 50 ~ 100
		//Math.random() * 51 => 0 ~ 50 + 50 => 50 ~ 100
		//(Math.random() * (최대범위숫자 +1 - 최소범위숫자) + 최소범위숫자)
		System.out.println((int)(Math.random() * (101 - 50) + 50));
		
	}
}
