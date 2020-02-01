package example4;

public class WaterMelon extends Fruit{
	double kg;
	
	WaterMelon(int price, double gram) {
		super(price, gram);
	}
	
	/* �޼ҵ� ������(Overriding) : ����Ŭ������ �޼ҵ��� ����� �ڽ�Ŭ�������� �����ϴ� ���
	 * ��ȯ�� + �޼ҵ�� + �Ű��������� + �Ű�����Ÿ���� ��� �����ؾߵȴ�.
	 * �θ𿡰� ���� �޼ҵ�� �������̵� �� �� ����� => ���ο� �޼ҵ� ����
	 * �θ��ʿ� ���� �Ű������� �߰��� ���� ����� => Ʋ�� �ƴ϶� ����� ����(���빰)
	 * 
	 * @Override : ��ø� ���־� ���� ���� �޼ҵ����� �������̵����� ����
	 * ���� ���̱�
	 * �˻� > ���� ���� �߰�
	 */
	
	@Override
	void info() {
		this.kg = super.gram * 0.001;
		System.out.printf("���� : %d��, ���� : %.2f(Kg)\n",this.price, this.kg);
	}
