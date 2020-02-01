package array;

public class Ex11 {
	public static void main(String[] args) {
		/* money에 저장된 금액을 동전으로 바꿨을때
		 * 최소 몇개의 동전을 거슬러 줘야하는지 출력
		 * (coin배열과 반복문을 이용)
		 * money = 2680;
		 * 500원 : 5
		 * 100원 : 1
		 * 50원 : 1
		 * 10원 : 3
		 * 총 10개의 동전을 건내줘야 합니다.
		 */
		int money = 2680, total = 0; //총 개수
		int[] coin = {500, 100, 50, 10};
		for(int i = 0; i < coin.length; i ++) {
			int count = money / coin[i]; //동전이 몇개인가?
			total += count; //총 몇개인가?
			money %= coin[i];
			System.out.println(coin[i] + "원 동전 : " + count);
		}
		System.out.println("총" + total + "개의 동전을 거슬러 줘야합니다.");
	}
}










