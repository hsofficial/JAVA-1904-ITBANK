package operator;

public class K_CompareExample {
	public static void main(String[] args) {
		//String이 int처럼 기본자료형은 아님
		//String은 클래스 => 클래스로 객체를 만들어 사용
		int num;
		String str1 = "KG ITBANK";//String class의 객체 str1
		String str2 = "KG ITBANK";
		String str3 = new String("KG ITBANK"); //new : malloc : 동적할당
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		//참조 타입(객체처럼 주소를 가지고 있는 비교 타입)을 비교할때 내부 값 비교하려면 equal 메서드 사용
		System.out.println(str1.equals(str3));
	}
}
