package example4;

public class Person {
	//����Ŭ���� ��ü : �ʵ�(��ü)�� ������
	Bank bank;
	
	void failToPay() {
		bank.counting();
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		
		//����� ���ఴü�� �̿��� ������ �̿�
		person.bank = new NonghyupBank("����", 5);
		for(int i = 0; i < 6; i ++)
			person.failToPay();
		
		person.bank = new ShinhanBank("����", 3);
		for(int i = 0; i < 4; i ++)
			person.failToPay();
	}
}
