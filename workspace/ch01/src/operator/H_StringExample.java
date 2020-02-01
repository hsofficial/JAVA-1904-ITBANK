package operator;

public class H_StringExample {
public static void main(String[] args) {
	/*
	 * 연산자 : +
	 * +는 산술, 부호연산자인 동시에 문자열 연결연산자
	 * 피연산자가 문자열일 경우 +연산자가 문자열을 연결함
	 * char[]배열처럼 굳이 몇칸인지 미리 할당을 안해도 된다
	 * 
	 */
	
	
	String str01 = "0"+"학번";
	System.out.println(str01);
	
	String str1 = 0 + (9 + "학번");
	System.out.println(str1);
	
	String str2 = str1 + ' ' + "홍길동";
	System.out.println(str2);
	
	String str3 = 3 + 0.14 + "(π)";
	System.out.println(str3);
	
	
	}

}
