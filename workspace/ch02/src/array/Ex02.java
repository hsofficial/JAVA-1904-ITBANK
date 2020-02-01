package array;

public class Ex02 {
	public static void main(String[] args) {
		//배열의 선언과 동시에 초기화(몇 칸인지 적어줄 필요 없어요)
		int[] arr = new int[] {88, 79, 65, 32, 45};
		int[] arr2 = {77, 98, 65, 21, 65}; //선언과 동시에 초기화시 new명령어 생략가능
		int sum = 0;
		
		//배열이 사실은 이미 만들어져있는 Array의 객체에요 => 내부에 메소드나 필드가 존재한다는 얘기
		//배열명.length : 필드(변수) => 몇 칸짜리 배열인지를 저장하는 필드
		for(int i = 0; i < arr.length; i ++)
			sum += arr[i];
		System.out.println("합계 : " + sum);
		double avg = sum / (double)arr.length;
		System.out.println("평균 : " + avg);
	}
}
