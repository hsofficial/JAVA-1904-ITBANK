package example;

//super, ����, �θ� Ŭ����
public class Tv {
	int channel;
	int volume;
	boolean power = false;
	
	Tv(){} //�����ڴ� Ŭ������ �Ȱ��� �̸��� �Լ��� ��ȯ���� ����� �� > �����Ϸ��� ������ �Ǵ�
	void powerSwitch() {
		power = !power;
		if(power)
			System.out.println("������ �������ϴ�.");
		else
			System.out.println("������ �������ϴ�.");
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
