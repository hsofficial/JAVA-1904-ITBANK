package example4;

public class Person {
	//상위클래스 객체 : 필드(객체)의 다형성
	Bank bank;
	
	void failToPay() {
		bank.counting();
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		
		//사람이 은행객체를 이용해 농협을 이용
		person.bank = new NonghyupBank("농협", 5);
		for(int i = 0; i < 6; i ++)
			person.failToPay();
		
		person.bank = new ShinhanBank("신한", 3);
		for(int i = 0; i < 4; i ++)
			person.failToPay();
	}
}
