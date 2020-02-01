package Random;

public class Ex02 {
	public static void main(String[] args) {
		double r = Math.random();
		//1 ~ 100까지의 난수 출력
		System.out.println((int)(Math.random() * (101 - 1) + 1));
		//35 ~ 77까지의 난수 출력
		System.out.println((int)(Math.random() * (78 - 35) + 35));
		//1 ~ 45까지의 난수 출력
		System.out.println((int)(Math.random() * (46 - 1) + 1));
	}

}
