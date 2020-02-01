package array;

public class Tv {
	//default 필드 : 패키지 내에서 접근가능
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
		if(power) {
			System.out.println("TV전원이 켜졌습니다.");
		}else {
			System.out.println("TV전원이 꺼졌습니다.");
		}
	}
	void channelUp() {
		++channel;
		System.out.println("ch : "+channel);
	}
	void channelDown() {
		--channel;
		System.out.println("ch : "+channel);
	}

}
