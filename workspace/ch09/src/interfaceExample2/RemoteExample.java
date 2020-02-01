package interfaceExample2;

public class RemoteExample {
	public static void main(String[] args) {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.setVolume(99999);
		rc.setVolume(-55555);
		rc.turnOff();
		
		SmartTv stv = new SmartTv();
		
		rc = stv;
		rc.turnOn();
		rc.setVolume(9);
//		rc.search(); 매나 추상클래스 개념이라 오버라이딩된 메소드만 사용가능
		Searchable search = stv;
		search.search("나혼자산다");
		rc.turnOff();
		
	}
}

/* TV리모콘(RemoteControl)
 * IPTV보려면 셋톱을 켜야함(Searchable)
 * 
 */

