package operator;

public class G_NaNInfinityExample {
	public static void main(String[] args) {
		int a = 5;
		double b = 0.0;
		
		double result = a / b;
		double result2 = a % b;
		System.out.println(result);
		System.out.println(result2);
		
		if(Double.isInfinite(result)) {
			System.out.println("0으로 나눌 수 없습니다");
		}else {
			System.out.println(result);
		}
		
		if(Double.isInfinite(result2)) {
			System.out.println("0으로 나눌 수 없습니다");
		}else {
			System.out.println(result);
		}
	}
}
