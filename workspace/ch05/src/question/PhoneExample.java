package question;

public class PhoneExample {
	public static void main(String[] args) {
		//��� �ڵ��� ���η�(static) : 20.5%
		Phone.setPromotion(20.5);
		Phone.setCompany("Samsung");//�ڵ�������ȸ��
		
		Phone hp1 = new Phone();
		//�𵨸�(���� : ���� + ���ڸ� �����ϵ���)
		hp1.setModel("SM-F900");
		//����(���� : �����̰ų� 300������ �ʰ��� �� ������)
		hp1.setPrice(2223000);
		hp1.info();
		/* ȸ�� : Apple
		 * �𵨸� : xr
		 * ���� : 1200000
		 * ���ΰ� : 954000
		 */
	}

}
