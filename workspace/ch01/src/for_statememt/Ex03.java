package for_statememt;

public class Ex03 {
	public static void main(String[] args) {
		//1 ~ 50까지의 3의 배수이거나 5의 배수인 숫자의 합계를 구하시오
		int sum = 0;
		for(int i = 1; i <= 50; i++) {
			if(i % 3 == 0|| i % 5 == 0)
				sum += i;
		}
		System.out.println(sum);
		
	}

}
