package array;

public class TvExample {
	public static void main(String[] args) {
		/* 클래스는 매나 자료형
		 * String => 클래스로 만든 자료형
		 * 배열로 묶어둘 수 있겠네
		 */
		int[] arr = new int[3];
		Tv[] tvArr = new Tv[3]; //Tv객체를 담을 3칸 짜리 배열 선언
		
		for(int i = 0; i < tvArr.length; i ++) {
			arr[i] = i + 1;
			tvArr[i] = new Tv(); //배열의 i번쨰에 Tv객체 생성
			tvArr[i].channel = i + 10;
		}
		for(int i = 0; i < tvArr.length; i ++) {
			System.out.print("tvArr[" + i + "] : ");
			tvArr[i].channelUp();
		}
	}

}
