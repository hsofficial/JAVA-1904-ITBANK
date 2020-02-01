package function;

public class Ex01 {
	public static void main(String[] args) {
		//코드가 실행되는 함수 => main함수
		//C언어에서는 main함수보다 위에다가 함수 선언 => JAVA는 상관없어요
		int []arr = {66, 55, 44, 11, 22};
		
		int m = max(arr);//함수의 호출(인자값을 전달)
		System.out.println("최대값 : " + m);
		m = min(arr);
		System.out.println("최소값 : " + m);
	}
	private static int min(int[] param) {
		int m = param[0];
		for(int i = 1; i < param.length; i ++) {
			if(m > param[i])
				m = param[i];
		}
		return m;
	}
	//int : 반환자료형(return할 데이터의 자료형)
	//max : 함수 이름
	public static int max(int[] param) { //int[] param : 매개변수
		int m = param[0];
		for(int i = 1; i < param.length; i ++) {
			if(m < param[i])
				m = param[i];
		}
		return m;
	}
}
