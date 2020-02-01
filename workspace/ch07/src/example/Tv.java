package example;

//super, 상위, 부모 클래스
public class Tv {
	int channel;
	int volume;
	boolean power = false;
	
	Tv(){} //생성자는 클래스와 똑같은 이름의 함수로 반환형도 없어야 함 > 컴파일러가 생성자 판단
	void powerSwitch() {
		power = !power;
		if(power)
			System.out.println("전원이 켜졌습니다.");
		else
			System.out.println("전원이 꺼졌습니다.");
	}
	
	void setChannel(int channel) {
		this.channel = channel;
		System.out.println("ch : " + channel);
	}
	void setVolume(int volume) {
		this.volume = volume;
		System.out.println("vol : " + volume);
	}
}
