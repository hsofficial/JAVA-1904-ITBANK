package variable;

public class E_FloatVariableExample {
	public static void main(String[] args) {
		// CPU가 계산을 가장 잘할 수 있는 타입 : int, double
		//정수 리터럴 : int
		//실수 리터럴 : double
		//F 붙여야 float 형태로 저장
		
		double var1 = 3.14;
		float var2 = 3.14F;
		
		System.out.println(var1);
		System.out.println(var2);
		
		var1 = 0.123456789123456789; //double
		var2 = 0.123456789123456789F; //float
		
		System.out.println(var1);
		System.out.println(var2);
		//float : 7자리까지 정확하게 처리
		//double : 15자리까지 정확하게 처리
		
		//지수 : 자리수를 좀 더 편하게 표시하려고 만들었어요
		//%e : 지수로 표현
		//%g : 실수로 표현을 하되 실수 범위를 넘어가면 지수로 표현
		//System.out.printf("%e, %g");
		
		double var3 = 12e3; //	12 * 10^3
		double var4 = 12e-3; // 12 * 10^-3(0.001)
		double var5 = 1.23e-3; // 1.23 * 10^-3
		
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	}

}
