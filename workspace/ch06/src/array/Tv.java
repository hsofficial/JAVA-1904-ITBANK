package array;

public class Tv {
	//default �ʵ� : ��Ű�� ������ ���ٰ���
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
		if(power) {
			System.out.println("TV������ �������ϴ�.");
		}else {
			System.out.println("TV������ �������ϴ�.");
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
