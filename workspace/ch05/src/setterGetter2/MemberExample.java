package setterGetter2;

public class MemberExample {
	public static void main(String[] args) {
		Member member1 = new Member("������",22,"����");
		member1.info();
		
		Member member2 = new Member("�۵���", 30, "����");
		member2.setName("�١�"); //�߸��� ������ => setter�� �ɷ������
		member2.setName("������");
		member2.info();
	}
	
}
