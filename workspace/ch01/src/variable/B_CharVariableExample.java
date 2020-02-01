package variable;

public class B_CharVariableExample {
	public static void main(String[] args) {
		/*프로그래밍 > 영어권 국가에서 출발
		 * char 1byte >>> 알파벳 기준
		 * java는 char 2byte
		 * ascii > 영어를 수로 바꾸기 위한 규칙
		 * OS / Language / SW 관계없이 문자마다 고유한 코드값 제공
		 * 유니코드 > 모든 언어 교환하기 위해 나온 코드체계
		 * 16bit로 모든 문자 표현 / 최대 65536개 글자 표현 가능
		 * https://www.unicode.org/charts/PDF/U0000.pdf
		 * http://www.unicode.org/charts/PDF/UAC00.pdf
		 */
		
		char var1 = 'N';
		char var2 = 78;
		char var3 = '\u004E';
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		char var4 = '나';
		char var5 = '\uB098';
		
		System.out.println(var4);
		System.out.println(var5);
		
	}
}
