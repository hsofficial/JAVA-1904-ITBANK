package for_statememt;

public class Ex01 {
	public static void main(String[] args) {
		//for >>> 반복 횟수를 예측할 수 있을때 사용
		int sum = 0;
		// 1 ~ 10까지의 합계를 구하라
		//while의 초기값, 조건식, 증감식을 한곳에 뭉쳐놓은 문법
		//i, j : index의 i =>관례적으로 자주 사용
		for(int i = 0; i <= 10; i ++)
			sum += i;
		System.out.println(sum);
	}

}
