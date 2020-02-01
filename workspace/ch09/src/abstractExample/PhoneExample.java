package abstractExample;

public class PhoneExample {
	public static void main(String[] args) {
		
		//추상클래스로는 객체를 못만듭니다. => idea theory
		Phone phone = new Phone("송진우");
		
		FolderPhone lolipop = new FolderPhone("홍길동");
		lolipop.turnOn();
		lolipop.sendMessage("메시지");
		lolipop.turnOff();
		
		SmartPhone galaxy = new SmartPhone("홍길순");
		galaxy.turnOn();
		galaxy.turnOff();
		
		/* 상속이 자손클래스를 만드는데 조상클래스를 사용하는 것이라면
		 * 추상화는 기존의 클래스에서 공통부분을 뽑아내서 조상클래스를 만드는 것
		 * 상속계층도를 따라 내려갈수록 세분화, 올라갈수록 공통요소만 남게된다.
		 */
	}
}
