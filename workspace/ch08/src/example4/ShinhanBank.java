package example4;

public class ShinhanBank extends Bank{
	
	public ShinhanBank(String name, int maxCount) {
		super(name, maxCount); //생성자 => 상위객체가 생성
	}

	@Override
	public void counting() { //미납횟수가 올라가는 메소드
		count++;
		if(count <= maxCount) {
			System.out.println("미납횟수 : " + count + " / " + maxCount);
		}else {
			System.out.println("신한은행 미납횟수가 초과되었습니다.");
		}
	}
}
