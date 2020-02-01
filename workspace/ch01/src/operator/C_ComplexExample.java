package operator;

public class C_ComplexExample {
	public static void main(String[] args) {
		//복합대입연산자
		int result = 0; //사용하기 전에 초기화
		
		result += 10;	//result = result + 10;
		System.out.println(result);
		result -= 5;
		System.out.println(result);
		result *= 6;
		System.out.println(result);
		result /= 3;
		System.out.println(result);
		result %= 7;
		System.out.println(result);
	}

}
