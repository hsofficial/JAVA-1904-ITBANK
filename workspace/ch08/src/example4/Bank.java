package example4;

public class Bank {
	public int maxCount;	//최대 미납횟수
	public int count;		//미납횟수(0으로 초기화)
	public String name;		//거래 은행이름
	
	//생성자
	public Bank(String name, int maxCount) {
		this.name = name;
		this.maxCount = maxCount;
		this.count = 0;
	}
	
	//메소드
	public void counting() {	//미납횟수가 올라가는 메소드
		count++;
		if(count <= maxCount) {
			System.out.println("미납횟수 : " + count + " / " + maxCount);
		}
		else {
			System.out.println("미납횟수가 초과되었습니다.");
		}
	}
}
