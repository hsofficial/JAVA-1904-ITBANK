package operator;

public class N_Question {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int result = (--a) + (b++);
		//result : 11
		
		/* 100원 짜리 동전이 1,234개가 있어요, 25명의 학생들에게 골고루 나눠줄 경우
		 * 한명당 몇개의 동전을 가지는 지 출력하고
		 * 몇개의 동전이 남는지
		 */
		int coin = 1234;
		int student = 25;

		//정수를 정수로 나누면 소수점이 나오지 않음
		System.out.println(coin / student);
		System.out.println(coin % student);
	}
}
