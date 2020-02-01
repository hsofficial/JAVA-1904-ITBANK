package operator;

public class J_CompareExample {
	public static void main(String[] args) {
		char ch1 = 'A';
		int n1 = 65;
		
		System.out.println(ch1 == n1);//ASCII코드로 보면 같은 데이터
		
		//비교할때 자동형변환
		//자바는 float을 저장하고 표시할때 F를 붙여준다  => 안붙이면 double타입
		System.out.println(5 == 5.0); //5.0 == 5.0
		System.out.println(0.5 == 0.5F); //(double)0.5 == (float)0.5
		System.out.println(0.1 == 0.1F); //0.100000000129522
		//float 6자리 double 15자리 저장
		//실수형은 연산자를 바로 사용하지 아니함
		
		int n2 = 1;
		double n3 = 0.1;
		System.out.println((int)(n3 * 10) == n2);
		
	}

}
