package variable;

public class F_CastingExample {
	public static void main(String[] args) {
		int intVar = 300; //32bit => 00000000 00000000 00000001 00101100
		
		//byte범위를 벗어났어 => 저장하면 안되지
		if(intVar > Byte.MAX_VALUE || intVar < Byte.MIN_VALUE) {
			//MAX_VALUE : 최대값 상수
			System.out.println("byte로 변환할 수 없어");
		}
		else {
			byte byteVar = (byte) intVar; //8bit => 00101100 => 32 + 8 + 4 => 44
			System.out.println(byteVar);
		}
		
		double doubleVar = 3.14;
		intVar = (int)doubleVar;
		System.out.println(intVar);
	
	}
}