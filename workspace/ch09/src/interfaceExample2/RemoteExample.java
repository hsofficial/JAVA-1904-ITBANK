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
//		rc.search(); �ų� �߻�Ŭ���� �����̶� �������̵��� �޼ҵ常 ��밡��
		Searchable search = stv;
		search.search("��ȥ�ڻ��");
		rc.turnOff();
		
	}
}

/* TV������(RemoteControl)
 * IPTV������ ������ �Ѿ���(Searchable)
 * 
 */

