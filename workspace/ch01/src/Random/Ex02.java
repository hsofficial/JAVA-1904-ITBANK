package Random;

public class Ex02 {
	public static void main(String[] args) {
		double r = Math.random();
		//1 ~ 100������ ���� ���
		System.out.println((int)(Math.random() * (101 - 1) + 1));
		//35 ~ 77������ ���� ���
		System.out.println((int)(Math.random() * (78 - 35) + 35));
		//1 ~ 45������ ���� ���
		System.out.println((int)(Math.random() * (46 - 1) + 1));
	}

}
